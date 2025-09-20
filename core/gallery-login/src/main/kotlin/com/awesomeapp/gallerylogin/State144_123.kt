package com.awesomeapp.gallerylogin

sealed class State144_123 {
    data object Loading : State144_123()
    data class Success(val data: String) : State144_123()
    data class Error(val message: String) : State144_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}