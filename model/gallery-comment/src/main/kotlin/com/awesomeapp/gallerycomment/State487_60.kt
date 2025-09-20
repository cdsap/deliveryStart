package com.awesomeapp.gallerycomment

sealed class State487_60 {
    data object Loading : State487_60()
    data class Success(val data: String) : State487_60()
    data class Error(val message: String) : State487_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}