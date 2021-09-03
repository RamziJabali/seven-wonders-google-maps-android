package com.eljabali.sevenwondersgooglemaps.viewmodel

import com.eljabali.sevenwondersgooglemaps.model.SevenWonders
import com.google.android.gms.maps.model.LatLng

data class ViewState(
        val sevenWonders: List<SevenWonders> = emptyList(),
        val currentWonderOfTheWorld: Int = -1
)