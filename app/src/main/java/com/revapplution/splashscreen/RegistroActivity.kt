package com.revapplution.splashscreen

import android.os.Bundle
import android.widget.ProgressBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {

    lateinit var progressRegistro: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        setSupportActionBar(findViewById(R.id.toolbar))

       supportActionBar?.title = "Creacion de cuenta"
        progressRegistro = findViewById(R.id.progressBarRegistro)
        progressRegistro.max = 4
        /*findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/
    }

    public fun incrementarProgress() {
        progressRegistro.max = 4
        progressRegistro.incrementProgressBy(1)
    }

    internal fun prueba() {

        progressRegistro.incrementProgressBy(1)
    }
}