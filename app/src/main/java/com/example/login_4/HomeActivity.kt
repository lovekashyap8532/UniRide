package com.example.login_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

@Suppress("NAME_SHADOWING")
class HomeActivity : AppCompatActivity() {

    private lateinit var loginbutton: Button
    private lateinit var signupbutton: Button
//    private lateinit var email: EditText
//    private lateinit var password: EditText
    private lateinit var auth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Bind the login and signup buttons
        loginbutton = findViewById(R.id.loginbutton)
        signupbutton = findViewById(R.id.signupbutton)


        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Set onClickListener for login button
        loginbutton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
            // Set onClickListener for signup button
            signupbutton.setOnClickListener {
                // Create Intent to navigate to SignupActivity
                val intent = Intent(this, SignupActivity::class.java)
                startActivity(intent)
            }
        }
    }

