package com.example.login_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.SupportMapFragment

class DriverHomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_home)

        val psginformation = findViewById<LinearLayout>(R.id.psginfo)
        psginformation.setOnClickListener {
            val intent = Intent(this, DriverFinalActivity::class.java)
            startActivity(intent)
        }

        val drvprofilebutton = findViewById<ImageButton>(R.id.drvprofilebutton)
        drvprofilebutton.setOnClickListener {
            // Launch the new activity when the ImageButton is clicked
            val intent = Intent(this, DriverProfileActivity::class.java)
            startActivity(intent)
        }

        val messengerbutton = findViewById<ImageButton>(R.id.drvmessenger_button)
        messengerbutton.setOnClickListener {
            val intent = Intent(this, Messenger::class.java)
            startActivity(intent)
        }

        val mapFragment = SupportMapFragment.newInstance()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.map, mapFragment)
            .commit()




    }
}