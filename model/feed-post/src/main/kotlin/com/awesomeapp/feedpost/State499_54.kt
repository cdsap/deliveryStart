package com.awesomeapp.feedpost

sealed class State499_54 {
    data object Loading : State499_54()
    data class Success(val data: String) : State499_54()
    data class Error(val message: String) : State499_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}