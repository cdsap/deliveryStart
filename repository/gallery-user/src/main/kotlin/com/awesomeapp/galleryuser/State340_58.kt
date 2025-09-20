package com.awesomeapp.galleryuser

sealed class State340_58 {
    data object Loading : State340_58()
    data class Success(val data: String) : State340_58()
    data class Error(val message: String) : State340_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}