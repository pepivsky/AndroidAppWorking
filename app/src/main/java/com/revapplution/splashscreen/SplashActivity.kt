package com.revapplution.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        /*setTheme(R.style.Theme_SplashScreen)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)*/
        setTheme(R.style.Theme_SplashScreen)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, LoginActivity::class.java))
        finish()


    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}