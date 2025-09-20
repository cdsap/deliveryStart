package com.awesomeapp.galleryuser

sealed class State340_73 {
    data object Loading : State340_73()
    data class Success(val data: String) : State340_73()
    data class Error(val message: String) : State340_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}