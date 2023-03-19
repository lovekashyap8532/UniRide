package com.example.login_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

@Suppress("JoinDeclarationAndAssignment")
class HomeActivity : AppCompatActivity(), OnMapReadyCallback {

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val profilebutton = findViewById<ImageButton>(R.id.profilebutton)
        profilebutton.setOnClickListener {
            // Launch the new activity when the ImageButton is clicked
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val messenger_button = findViewById<ImageButton>(R.id.messenger_button)
        messenger_button.setOnClickListener {
            val intent = Intent(this, Messenger::class.java)
            startActivity(intent)
        }

        val near_rider = findViewById<Button>(R.id.near_rider)
        near_rider.setOnClickListener {
            val intent = Intent(this, NearDriver::class.java)
            startActivity(intent)
        }

        val mapFragment = SupportMapFragment.newInstance()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.map, mapFragment)
            .commit()

    }
    override fun onMapReady(p0: GoogleMap) {
        TODO("Not yet implemented")
    }


}
