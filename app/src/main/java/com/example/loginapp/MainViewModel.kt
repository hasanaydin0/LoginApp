package com.example.loginapp

import android.util.Patterns
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    fun verifyCredentials(email:String, password: String){

    }

    fun verifyEmail(email: String):Boolean? {
        var isValid:Boolean? = null
        viewModelScope.launch {
            isValid = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }
        return isValid
    }

    fun verifyPassword(password: String) {

    }

    fun login(email: String, password: String) {

    }
}