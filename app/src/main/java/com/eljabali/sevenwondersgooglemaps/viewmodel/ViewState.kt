package com.eljabali.sevenwondersgooglemaps.viewmodel

import com.eljabali.sevenwondersgooglemaps.model.SevenWonders

data class ViewState(
        val sevenWonders: List<SevenWonders> = emptyList(),
        val currentWonderOfTheWorld: Int = -1
)