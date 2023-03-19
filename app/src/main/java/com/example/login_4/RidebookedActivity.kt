package com.example.login_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class RidebookedActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ridebooked)

        val feedback = findViewById<LinearLayout>(R.id.feedback_2)
        feedback.setOnClickListener {
            val intent = Intent(this, FeedbackActivity::class.java)
            startActivity(intent)
        }


    }
}