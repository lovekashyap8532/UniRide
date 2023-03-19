package com.example.login_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<Button>(R.id.user)
        user.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        val driver = findViewById<Button>(R.id.driver)
        driver.setOnClickListener {
            val intent = Intent(this, DriverSignupActivity::class.java)
            startActivity(intent)
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
