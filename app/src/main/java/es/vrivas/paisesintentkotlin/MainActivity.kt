package es.vrivas.paisesintentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

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
        val i = Intent(this, EspanaActivity::class.java)
        startActivity(i)
    }


    /* Callback de respuesta al botón Francia
     Se llama EXPRESAMENTE a la actividad Francia
     */
    @Suppress("UNUSED_PARAMETER")
    fun francia_click(view: View) {
        val i = Intent(this, FranciaActivity::class.java)
        startActivity(i)
    }


    /* Callback de respuesta al botón Portugal
        Se llama EXPRESAMENTE a la actividad Pais pasándole los datos que necesita
        ¿por qué sigue sin funcionar el to-do en github al hacer el commit?
        @todo Pasar los datos que queremos a la actividad Pais
    */
    @Suppress("UNUSED_PARAMETER")
    fun portugal_click(view: View) {
        val i = Intent(this, PaisActivity::class.java)
        startActivity(i)
    }

}