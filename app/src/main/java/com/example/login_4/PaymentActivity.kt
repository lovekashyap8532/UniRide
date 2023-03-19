package com.example.login_4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaymentActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        val offlinebutton2 = findViewById<Button>(R.id.offlinebutton2)
        offlinebutton2.setOnClickListener {
            val intent = Intent(this, RidebookedActivity::class.java)
            startActivity(intent)
        }

        val online_button_2 = findViewById<Button>(R.id.onlinebutton_2)
        online_button_2.setOnClickListener {
            val intent = Intent(this, OnlinePayment::class.java)
            startActivity(intent)
        }


    }
}