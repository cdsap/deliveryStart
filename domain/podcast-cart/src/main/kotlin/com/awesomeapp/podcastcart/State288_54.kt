package com.awesomeapp.podcastcart

sealed class State288_54 {
    data object Loading : State288_54()
    data class Success(val data: String) : State288_54()
    data class Error(val message: String) : State288_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}