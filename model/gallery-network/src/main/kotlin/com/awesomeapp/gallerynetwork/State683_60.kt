package com.awesomeapp.gallerynetwork

sealed class State683_60 {
    data object Loading : State683_60()
    data class Success(val data: String) : State683_60()
    data class Error(val message: String) : State683_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}