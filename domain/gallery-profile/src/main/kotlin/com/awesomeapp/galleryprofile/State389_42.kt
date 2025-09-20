package com.awesomeapp.galleryprofile

sealed class State389_42 {
    data object Loading : State389_42()
    data class Success(val data: String) : State389_42()
    data class Error(val message: String) : State389_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}