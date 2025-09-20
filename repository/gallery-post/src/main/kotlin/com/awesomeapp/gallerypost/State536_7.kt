package com.awesomeapp.gallerypost

sealed class State536_7 {
    data object Loading : State536_7()
    data class Success(val data: String) : State536_7()
    data class Error(val message: String) : State536_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}