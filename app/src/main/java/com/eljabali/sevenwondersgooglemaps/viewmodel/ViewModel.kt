package com.eljabali.sevenwondersgooglemaps.viewmodel

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.BehaviorSubject

class ViewModel: ViewModel() {
    private var viewState = ViewState()
    val viewStateObservable = BehaviorSubject.create<ViewState>()

    fun startApp(){

    }

    override fun onCleared() {
        super.onCleared()
    }

}