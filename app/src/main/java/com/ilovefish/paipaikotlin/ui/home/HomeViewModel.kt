package com.ilovefish.paipaikotlin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is 抢单 Fragment"
    }
    val text: LiveData<String> = _text
}