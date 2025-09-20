package com.awesomeapp.podcastcart

sealed class State288_84 {
    data object Loading : State288_84()
    data class Success(val data: String) : State288_84()
    data class Error(val message: String) : State288_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}