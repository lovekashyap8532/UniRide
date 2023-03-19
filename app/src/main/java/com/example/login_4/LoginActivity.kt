package com.example.login_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var emai: EditText
    private lateinit var password: EditText
    private lateinit var loginbutton: Button
    private lateinit var auth: FirebaseAuth


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        emai = findViewById(R.id.username)
        password = findViewById(R.id.password)
        loginbutton = findViewById(R.id.loginbutton)

        auth = FirebaseAuth.getInstance()

        loginbutton.setOnClickListener {
            val email = emai.text.toString()
            val password = password.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            } else {
                // ...
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            auth.currentUser
                            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()

                            // Redirect to HomeActivity
                            val intent = Intent(this, HomeActivity::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(this, "Authentication failed", Toast.LENGTH_SHORT).show()
                        }
                    }

            }
        }
    }

//    override fun onStart() {
//        super.onStart()
//        if(FirebaseAuth.getInstance().currentUser != null) {
//            val intent = Intent(this,HomeActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
//    }
}
