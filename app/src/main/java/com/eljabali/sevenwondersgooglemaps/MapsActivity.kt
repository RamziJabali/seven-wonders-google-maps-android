package com.eljabali.sevenwondersgooglemaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private val pyramidsOfGiza = LatLng(29.97730524865085, 31.13249479583215)
    private val statueOfZeus = LatLng(37.63806220183685, 21.630222000818012)
    private val hangingGardenOfBabylon: LatLng = LatLng(34.99142465790425, 42.40516143736894)

    private lateinit var pyramidsOfGizaMarker: Marker
    private lateinit var statueOfZeusMarker: Marker
    private lateinit var hangingGardenOfBabylonMarker: Marker


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.addMarker(MarkerOptions().position(pyramidsOfGiza).title("Pyramids Of Giza"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pyramidsOfGiza))

        pyramidsOfGizaMarker = mMap.addMarker(
                MarkerOptions()
                        .position(pyramidsOfGiza)
                        .title("Pyramids Of Giza")
        )
        pyramidsOfGizaMarker.tag = 0

        hangingGardenOfBabylonMarker = mMap.addMarker(
                MarkerOptions()
                        .position(hangingGardenOfBabylon)
                        .title("Hanging Garden of Babylon")
        )
        hangingGardenOfBabylonMarker.tag = 0

        statueOfZeusMarker = mMap.addMarker(
                MarkerOptions()
                        .position(statueOfZeus)
                        .title("Statue of Zeus")
        )
        statueOfZeusMarker.tag = 0
    }
}