package com.example.login_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {

    private lateinit var signupbutton: Button
    private lateinit var username: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText

    private lateinit var auth: FirebaseAuth // declare an instance of FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Bind the signup button and EditText views
        signupbutton = findViewById(R.id.signupbutton)
        username = findViewById(R.id.username)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        // Set onClickListener for signup button
        signupbutton.setOnClickListener {
            // Get user input from EditText fields
            val name = username.text.toString()
            val email = email.text.toString()
            val password = password.text.toString()

            // Validate user input
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                // Display an error message to the user indicating that all fields are required
                Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
            } else {
                // Create a new user with email and password
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            auth.currentUser
                            Log.d(TAG, "createUserWithEmail:success")
                            // Do any additional tasks you need to do after the user is signed up
                            // For example, save the user information to a database

                            // Redirect to main activity
                            // Replace com.example.login_4.MainActivity with the activity you want to redirect to
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.exception)
                            // Display an error message to the user indicating that account creation failed
                            Toast.makeText(this, "Account creation failed", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    companion object {
        private const val TAG = "SignupActivity"
    }
}
