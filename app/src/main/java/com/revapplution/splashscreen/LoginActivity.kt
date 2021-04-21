package com.revapplution.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    lateinit var btnRegistro: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initializeUI()
    }

    private fun initializeUI() {
        btnRegistro = findViewById(R.id.btnRegistro)
        btnRegistro.setOnClickListener {
            intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}