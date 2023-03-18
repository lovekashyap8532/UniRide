package com.example.login_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class DriverSignupActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var username: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var mobile: EditText
    private lateinit var signupbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_signup)

        auth = FirebaseAuth.getInstance()

        // Bind the name, email, password, and confirm password EditText fields
        username = findViewById(R.id.username)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        mobile = findViewById(R.id.mobile)

        // Bind the signup button
        signupbutton = findViewById(R.id.signupbutton)

        // Set onClickListener for signup button
        signupbutton.setOnClickListener {
            // Get user input from EditText fields
            val nameInput = username.text.toString()
            val emailInput = email.text.toString()
            val passwordInput = password.text.toString()
            val mobileInput = mobile.text.toString()

            // Validate user input
            if (nameInput.isEmpty() || emailInput.isEmpty() || passwordInput.isEmpty() || mobileInput.isEmpty()) {
                // Display an error message to the user indicating that all fields are required
                Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
//            } else if (passwordInput != mobileInput) {
//                // Display an error message to the user indicating that the passwords do not match
//                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else {
                // Create user in Firebase Auth
                auth.createUserWithEmailAndPassword(emailInput, passwordInput)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Redirect to ProfileActivity
                            startActivity(Intent(this, HomeActivity::class.java))
                            finish()
                        } else {
                            // If sign up fails, display a message to the user.
                            Toast.makeText(this, "Authentication failed", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }

    }
}