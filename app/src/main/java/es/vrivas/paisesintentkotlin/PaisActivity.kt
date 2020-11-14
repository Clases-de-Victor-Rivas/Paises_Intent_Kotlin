package es.vrivas.paisesintentkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pais.*
import java.text.DecimalFormat
import java.util.*

class PaisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pais)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        // Recuperamos los datos pasados al intent
        val nombre_pais=intent.getStringExtra("NOMBRE-PAIS")
        val extension_pais = intent.getIntExtra("EXTENSION-PAIS", 0)
        val poblacion_pais = intent.getIntExtra("POBLACION-PAIS", 0)

        // Actualizamos los widgets de la actividad
        tv_pais.text=nombre_pais
        tv_extension.text=tv_extension.text
            .toString().replace("?", extension_pais.toString() + "")
        tv_poblacion.text=tv_poblacion.text
            .toString().replace("?", poblacion_pais.toString() + "")
    }
}