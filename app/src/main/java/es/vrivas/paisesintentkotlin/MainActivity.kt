package es.vrivas.paisesintentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    val PARAM_COUNTRY_NAME = "NOMBRE-PAIS"
    val PARAM_POPULATION = "POBLACION-PAIS"
    val PARAM_EXTENSION = "EXTENSION-PAIS"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* Callback de respuesta al botón España
     Se llama EXPRESAMENTE a la actividad Espana
     */
    @Suppress("UNUSED_PARAMETER")
    fun espana_click(view: View) {
        val i = Intent(this, EspanaActivity::class.java)
        startActivity(i)
    }


    /* Callback de respuesta al botón Francia
     Se llama EXPRESAMENTE a la actividad Pais pasándole los datos que necesita
     */
    @Suppress("UNUSED_PARAMETER")
    fun francia_click(view: View) {
        val i = Intent(this, PaisActivity::class.java)
        i.putExtra("NOMBRE-PAIS", R.string.francia)
        i.putExtra("EXTENSION-PAIS", 675_417)
        i.putExtra( "POBLACION-PAIS", 6_7028_048)
        startActivity(i)
    }


    /* Callback de respuesta al botón Portugal
        Se llama EXPRESAMENTE a la actividad Pais pasándole los datos que necesita.
    */
    @Suppress("UNUSED_PARAMETER")
    fun portugal_click(view: View) {
        val i = Intent(this, PaisActivity::class.java)
        i.putExtra(PARAM_COUNTRY_NAME, R.string.portugal)
        i.putExtra(PARAM_EXTENSION, 92_090)
        i.putExtra( PARAM_POPULATION, 10_562_178)
        startActivity(i)
    }

}