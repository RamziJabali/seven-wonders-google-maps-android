package com.eljabali.sevenwondersgooglemaps.viewmodel

import androidx.lifecycle.ViewModel
import com.eljabali.sevenwondersgooglemaps.model.SevenWonders
import io.reactivex.subjects.BehaviorSubject

class ViewModel : ViewModel() {
    private var viewState = ViewState()

    val viewStateObservable = BehaviorSubject.create<ViewState>()

    fun startApp() {
        viewState = viewState.copy(sevenWonders = SevenWonders.getListOfSevenWonders(), currentWonderOfTheWorld = 0)
        invalidateViewState()
    }

    fun rightClick() {
        viewState = if (viewState.currentWonderOfTheWorld == 6) {
            viewState.copy(currentWonderOfTheWorld = 0)
        } else {
            viewState.copy(currentWonderOfTheWorld = viewState.currentWonderOfTheWorld + 1)
        }
        invalidateViewState()
    }

    fun leftClick() {
        viewState = if (viewState.currentWonderOfTheWorld == 0) {
            viewState.copy(currentWonderOfTheWorld = 6)
        } else {
            viewState.copy(currentWonderOfTheWorld = viewState.currentWonderOfTheWorld - 1)
        }
        invalidateViewState()
    }

    private fun invalidateViewState() {
        viewStateObservable.onNext(viewState)
    }
}