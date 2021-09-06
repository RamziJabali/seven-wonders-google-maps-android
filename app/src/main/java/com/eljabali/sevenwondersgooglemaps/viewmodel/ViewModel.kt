package com.eljabali.sevenwondersgooglemaps.viewmodel

import androidx.lifecycle.ViewModel
import com.eljabali.sevenwondersgooglemaps.model.SevenWonders
import io.reactivex.subjects.BehaviorSubject

class ViewModel : ViewModel() {
    private var viewState = ViewState()

    val viewStateObservable = BehaviorSubject.create<ViewState>()

    fun onAppStart() {
        viewState = viewState.copy(
            sevenWonders = SevenWonders.values().toList(),
            currentWonderOfTheWorld = 0
        )
        invalidateViewState()
    }

    fun onRightClick() {
        viewState = if (viewState.currentWonderOfTheWorld == viewState.sevenWonders.size - 1) {
            viewState.copy(currentWonderOfTheWorld = 0)
        } else {
            viewState.copy(currentWonderOfTheWorld = viewState.currentWonderOfTheWorld + 1)
        }
        invalidateViewState()
    }

    fun onLeftClick() {
        viewState = if (viewState.currentWonderOfTheWorld == 0) {
            viewState.copy(currentWonderOfTheWorld = viewState.sevenWonders.size - 1)
        } else {
            viewState.copy(currentWonderOfTheWorld = viewState.currentWonderOfTheWorld - 1)
        }
        invalidateViewState()
    }

    private fun invalidateViewState() {
        viewStateObservable.onNext(viewState)
    }
}