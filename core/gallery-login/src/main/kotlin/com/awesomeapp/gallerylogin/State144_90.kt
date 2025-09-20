package com.awesomeapp.gallerylogin

sealed class State144_90 {
    data object Loading : State144_90()
    data class Success(val data: String) : State144_90()
    data class Error(val message: String) : State144_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}