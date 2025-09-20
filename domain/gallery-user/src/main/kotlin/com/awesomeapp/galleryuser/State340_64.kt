package com.awesomeapp.galleryuser

sealed class State340_64 {
    data object Loading : State340_64()
    data class Success(val data: String) : State340_64()
    data class Error(val message: String) : State340_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}