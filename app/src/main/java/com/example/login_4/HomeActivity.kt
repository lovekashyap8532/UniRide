package com.example.login_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Bind the login and signup buttons
        val loginButton = findViewById<Button>(R.id.loginbutton)
        val signupButton = findViewById<Button>(R.id.signupbutton)

        // Set onClickListener for login button
        loginButton.setOnClickListener {
            // Create Intent to navigate to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // close HomeActivity
        }

        // Set onClickListener for signup button
        signupButton.setOnClickListener {
            // Create Intent to navigate to SignupActivity
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
