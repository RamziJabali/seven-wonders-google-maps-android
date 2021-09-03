package com.eljabali.sevenwondersgooglemaps.view

import com.eljabali.sevenwondersgooglemaps.viewmodel.ViewState


interface ViewListener {
    fun setNewViewState(viewState: ViewState)
}