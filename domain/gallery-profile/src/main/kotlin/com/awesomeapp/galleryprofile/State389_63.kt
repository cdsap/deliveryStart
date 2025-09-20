package com.awesomeapp.galleryprofile

sealed class State389_63 {
    data object Loading : State389_63()
    data class Success(val data: String) : State389_63()
    data class Error(val message: String) : State389_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}