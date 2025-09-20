package com.awesomeapp.photonetwork

sealed class State682_75 {
    data object Loading : State682_75()
    data class Success(val data: String) : State682_75()
    data class Error(val message: String) : State682_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}