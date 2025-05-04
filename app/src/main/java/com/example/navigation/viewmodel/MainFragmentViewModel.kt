package com.example.navigation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainFragmentViewModel: ViewModel() {

    private val _token = MutableLiveData<Int>()
    val token: LiveData<Int> get() = _token

    fun setToken(token: Int) {
        _token.value = token
    }
}