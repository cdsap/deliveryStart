package com.awesomeapp.photonetwork

sealed class State682_114 {
    data object Loading : State682_114()
    data class Success(val data: String) : State682_114()
    data class Error(val message: String) : State682_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}