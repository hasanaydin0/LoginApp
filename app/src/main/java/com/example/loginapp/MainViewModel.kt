package com.example.loginapp

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    val liveDataEmail : MutableLiveData<Boolean> =MutableLiveData()

    fun verifyCredentials(email:String, password: String){

    }

    fun verifyEmail(email: String) {
        var isValid:Boolean? = null
        viewModelScope.launch {
            delay(5000)
            isValid = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()

            liveDataEmail.postValue(isValid)
        }

    }

    fun verifyPassword(password: String) {

    }

    fun login(email: String, password: String) {

    }
}