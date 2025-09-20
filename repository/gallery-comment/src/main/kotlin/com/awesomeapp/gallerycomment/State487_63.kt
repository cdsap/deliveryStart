package com.awesomeapp.gallerycomment

sealed class State487_63 {
    data object Loading : State487_63()
    data class Success(val data: String) : State487_63()
    data class Error(val message: String) : State487_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}