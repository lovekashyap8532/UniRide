package com.example.login_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DriverLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_login)

        val loginbutton = findViewById<Button>(R.id.loginbutton)
        loginbutton.setOnClickListener {
            val intent = Intent(this, DriverHomeActivity::class.java)
            startActivity(intent)
        }
    }
}