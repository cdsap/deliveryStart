package com.awesomeapp.gallerycomment

sealed class State487_51 {
    data object Loading : State487_51()
    data class Success(val data: String) : State487_51()
    data class Error(val message: String) : State487_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}