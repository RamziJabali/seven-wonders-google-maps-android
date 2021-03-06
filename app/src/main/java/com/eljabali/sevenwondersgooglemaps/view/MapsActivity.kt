package com.eljabali.sevenwondersgooglemaps.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.WindowCompat
import com.eljabali.sevenwondersgooglemaps.R
import com.eljabali.sevenwondersgooglemaps.viewmodel.ViewModel
import com.eljabali.sevenwondersgooglemaps.viewmodel.ViewState
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.squareup.picasso.Picasso
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MapsActivity : AppCompatActivity(), OnMapReadyCallback, ViewListener {


    companion object {
        private const val ZOOM_LEVEL = 16F
    }

    private val viewModel by lazy { ViewModel() }
    private val compositeDisposable = CompositeDisposable()

    private val mBottomSheetLayout: LinearLayout by lazy { findViewById(R.id.bottom_sheet_layout) }
    private val sheetBehavior by lazy { BottomSheetBehavior.from(mBottomSheetLayout) }
    private val rightArrowImageView: ImageView by lazy { findViewById(R.id.rightArrowImageView) }
    private val leftArrowImageView: ImageView by lazy { findViewById(R.id.leftArrowImageView) }
    private val headerArrowImageView: ImageView by lazy { findViewById(R.id.expandMinimizeBottomSheet) }
    private val wonderOfTheWorldImageView: ImageView by lazy { findViewById(R.id.expandedImageView) }
    private val locationTextView: TextView by lazy { findViewById(R.id.minimizedTextView) }
    private val locationDescriptionTextView: TextView by lazy { findViewById(R.id.description) }

    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setup()
        compositeDisposable.add(viewModel.viewStateObservable
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { viewState ->
                setNewViewState(viewState)
            })
        viewModel.onAppStart()
    }

    override fun setNewViewState(viewState: ViewState) {
        viewState.apply {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(sevenWonders[currentWonderOfTheWorld].location,ZOOM_LEVEL))
            Picasso.get()
                .load(sevenWonders[currentWonderOfTheWorld].wonderOfTheWorldImageURL)
                .into(wonderOfTheWorldImageView)
            locationTextView.text = getString(sevenWonders[currentWonderOfTheWorld].locationName)
            locationDescriptionTextView.text =
                getString(sevenWonders[currentWonderOfTheWorld].description)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
    }

    private fun setup() {
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        headerArrowImageView.setOnClickListener {
            if (sheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
                sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
            } else {
                sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED)
            }
        }
        sheetBehavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {

            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                headerArrowImageView.rotation = slideOffset * 180
            }
        })
        rightArrowImageView.setOnClickListener {
            viewModel.onRightClick()
        }
        leftArrowImageView.setOnClickListener {
            viewModel.onLeftClick()
        }
    }
}
