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

    fun espana_click(view: View) {

        val i = Intent(this, EspanaActivity::class.java)
        startActivity(i)
    }
}