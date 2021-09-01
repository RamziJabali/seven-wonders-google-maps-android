package com.eljabali.sevenwondersgooglemaps.viewmodel

import com.google.android.gms.maps.model.LatLng

data class ViewState(
        val latitudeLongitude: LatLng = LatLng(0.0, 0.0)
)