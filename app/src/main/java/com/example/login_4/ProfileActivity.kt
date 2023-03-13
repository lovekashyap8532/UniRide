package com.example.login_4

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.navigation.NavigationView
class ProfileActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var currentLocation: EditText
    private lateinit var destination: EditText



    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Set up the map fragment
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment
        mapFragment.getMapAsync(this)

        // Inflate the header view for the navigation drawer
        val navigationView = findViewById<NavigationView>(com.google.android.material.R.id.navigation_bar_item_icon_view)
        val headerView = navigationView.getHeaderView(0)
        val profileImage = headerView.findViewById<ImageView>(R.id.user_image)
        val profileName = headerView.findViewById<TextView>(R.id.user_name)
        val profileEmail = headerView.findViewById<TextView>(R.id.user_email)

        // Set the user's profile picture, name, and email
        profileImage.setImageResource(R.drawable.profile_pic)
        profileName.text = "John Doe"
        profileEmail.text = "johndoe@example.com"

        // Get references to the current location and destination EditText views
        currentLocation = findViewById(R.id.current_location)
        destination = findViewById(R.id.destination)

        // Set the text of the current location EditText to the user's current location
        currentLocation.setText("Your current location")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.messenger -> {
                // Handle message button click
                Toast.makeText(this, "Message button clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.settings -> {
                // Handle options button click
                Toast.makeText(this, "Options button clicked", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker at the user's current location and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}
