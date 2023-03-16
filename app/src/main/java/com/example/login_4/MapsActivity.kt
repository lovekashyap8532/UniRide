package com.example.login_4

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.view.SearchEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context

//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

@Suppress("PrivatePropertyName")
abstract class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
//    private lateinit var fusedLocationClient: FusedLocationProviderClient
//    private lateinit var currentLocation: Location
//    private val permissionCode = 101
//    private val LOCATION_PERMISSION_REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
    }
}
//
//        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//
//        val mapFragment = supportFragmentManager
//            .findFragmentById(R.id.mapview) as SupportMapFragment
//        mapFragment.getMapAsync( this)
//
////        getCurrentLocationUser()
//        kunalMap()
//    }
//
//    /*private fun getCurrentLocationUser(){
//        if(ActivityCompat.checkSelfPermission(
//                this,android.Manifest.permission.ACCESS_FINE_LOCATION)!=
//                PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
//                this,android.Manifest.permission.ACCESS_COARSE_LOCATION)!=
//                PackageManager.PERMISSION_GRANTED){
//            ActivityCompat.requestPermissions( this,
//            arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),permissionCode)
//            return
//        }
//
//        val fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)
//        fusedLocationProviderClient.lastLocation.addOnSuccessListener { location ->
//            if (location != null) {
//                currentLocation = location
//                Toast.makeText(
//                    applicationContext,
//                    "${currentLocation.latitude} ${currentLocation.longitude}",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//        }
//    }*/
//    private fun kunalMap(googleMap: GoogleMap) {
//        if (ActivityCompat.checkSelfPermission(
//                this,
//                Manifest.permission.ACCESS_FINE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
//                this,
//                Manifest.permission.ACCESS_COARSE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return
//        }
//        fusedLocationClient.lastLocation.addOnSuccessListener() {
//            googleMap.addMarker(
//                MarkerOptions().position()
//            )
//        }
//    }
//
//
//    override fun onSearchRequested(searchEvent: SearchEvent?): Boolean {
//        return super.onSearchRequested(searchEvent)
//    }
//
//    override fun onMapReady(googleMap: GoogleMap) {
//
//        val latLng = LatLng(currentLocation.latitude, currentLocation.longitude)
//        val markerOptions = MarkerOptions().position(latLng).title("Current Location")
//        googleMap?.animateCamera(CameraUpdateFactory.newLatLng((latLng)))
//        googleMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 16f))
//        googleMap?.addMarker(markerOptions)
////        mMap = googleMap
//
//        // Check for location permission and request if not granted
////        if (ContextCompat.checkSelfPermission(this,
////                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
////            ActivityCompat.requestPermissions(this,
////                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
////                LOCATION_PERMISSION_REQUEST_CODE)
////        } else {
////            // Permission already granted, get current location
////            fusedLocationClient.lastLocation
////                .addOnSuccessListener { location ->
////                    if (location != null) {
////                        val currentLatLng = LatLng(location.latitude, location.longitude)
////                        mMap.addMarker(MarkerOptions().position(currentLatLng).title("Current Location"))
////                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 16f))
////                    }
////                }
////        }
//
////        googleMap.addMarker(
////            MarkerOptions().position(LatLng(0.0,0.0)).title("Marker")
////        )
//    }
//
//
//    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
//            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                getCurrentLocationUser()
//                // Permission granted, get current location
////                if (ActivityCompat.checkSelfPermission(
////                        this,
////                        Manifest.permission.ACCESS_FINE_LOCATION
////                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
////                        this,
////                        Manifest.permission.ACCESS_COARSE_LOCATION
////                    ) != PackageManager.PERMISSION_GRANTED
////                ) {
////                    // TODO: Consider calling
////                    //    ActivityCompat#requestPermissions
////                    // here to request the missing permissions, and then overriding
////                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
////                    //                                          int[] grantResults)
////                    // to handle the case where the user grants the permission. See the documentation
////                    // for ActivityCompat#requestPermissions for more details.
////                    return
////                }
////                fusedLocationClient.lastLocation
////                    .addOnSuccessListener { location ->
////                        if (location != null) {
////                            val currentLatLng = LatLng(location.latitude, location.longitude)
////                            mMap.addMarker(MarkerOptions().position(currentLatLng).title("Current Location"))
////                            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 16f))
////                        }
////                    }
////            } else {
////                // Permission denied, show message
////                Toast.makeText(this, "Location permission denied", Toast.LENGTH_SHORT).show()
////            }
//        }
//    }
//}
//}
