package es.vrivas.paisesintentkotlin

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* Callback de respuesta al botón España
     Se llama EXPRESAMENTE a la actividad Espana
     */
    @Suppress("UNUSED_PARAMETER")
    fun espana_click(view: View) {
        try {
            val i = Intent(this, EspanaActivity::class.java)
            startActivity(i)
            (view as TextView).text=getString(R.string.espana)+" (V)"
        } catch ( e: ActivityNotFoundException ){
            Snackbar.make( view,
                "espana_click: Activity Not Found",
                Snackbar.LENGTH_LONG ).show()
        }
    }


    /* Callback de respuesta al botón Francia
     Se llama EXPRESAMENTE a la actividad Pais pasándole los datos que necesita
     El nombre de los parámetros se pasa usando cadenas ad-hoc
     */
    @Suppress("UNUSED_PARAMETER")
    fun francia_click(view: View) {
        try {
            val i = Intent(this, PaisActivity::class.java)
            i.putExtra("NOMBRE-PAIS", getString(R.string.francia))
            i.putExtra("EXTENSION-PAIS", 675_417)
            i.putExtra( "POBLACION-PAIS", 6_7028_048)
            i.putExtra("OTROS-DATOS-PAIS", arrayOf<String>("Francés", "Euro", "París"))
            startActivity(i)
            (view as TextView).text=getString(R.string.francia)+" (V)"
        } catch ( e: ActivityNotFoundException ){
            Snackbar.make( view,
                "francia_click: Activity Not Found",
                Snackbar.LENGTH_LONG ).show()
        }
    }


    /* Callback de respuesta al botón Portugal
        Se llama EXPRESAMENTE a la actividad Pais pasándole los datos que necesita.
        El nombre de los parámetros se pasa usando valores almacenados en constantes en la clase.
    */
    @Suppress("UNUSED_PARAMETER")
    fun portugal_click(view: View) {
        try {
            val i = Intent(this, PaisActivity::class.java)
            i.putExtra(PARAM_COUNTRY_NAME, getString(R.string.portugal))
            i.putExtra(PARAM_EXTENSION, 92_090)
            i.putExtra(PARAM_POPULATION, 10_562_178)
            i.putExtra(PARAM_OTHERS, arrayOf<String>("Portugués", "Euro", "Lisboa"))
            startActivity(i)
            (view as TextView).text=getString(R.string.portugal)+" (V)"
        } catch ( e: ActivityNotFoundException ){
            Snackbar.make( view,
                "portugal_click: Activity Not Found",
                Snackbar.LENGTH_LONG ).show()
        }

    }

    companion object MAIN_ACTIVITY{
        val PARAM_COUNTRY_NAME = "NOMBRE-PAIS"
        val PARAM_POPULATION = "POBLACION-PAIS"
        val PARAM_EXTENSION = "EXTENSION-PAIS"
        val PARAM_OTHERS = "OTROS-DATOS-PAIS"
    }
}