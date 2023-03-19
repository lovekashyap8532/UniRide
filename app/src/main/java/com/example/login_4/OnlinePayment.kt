package com.example.login_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnlinePayment : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_payment)

//        val profilebutton = findViewById<ImageButton>(R.id.profilebutton)
//        profilebutton.setOnClickListener {
//            // Launch the new activity when the ImageButton is clicked
//            val intent = Intent(this, ProfileActivity::class.java)
//            startActivity(intent)
//        }

        val processpay = findViewById<Button>(R.id.processpay)
        processpay.setOnClickListener {
            // Launch the new activity when the ImageButton is clicked
            val intent = Intent(this, RidebookedActivity::class.java)
            startActivity(intent)
        }



    }
}