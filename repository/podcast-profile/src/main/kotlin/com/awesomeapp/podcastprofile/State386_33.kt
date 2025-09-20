package com.awesomeapp.podcastprofile

sealed class State386_33 {
    data object Loading : State386_33()
    data class Success(val data: String) : State386_33()
    data class Error(val message: String) : State386_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}