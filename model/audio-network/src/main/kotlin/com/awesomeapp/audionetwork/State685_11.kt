package com.awesomeapp.audionetwork

sealed class State685_11 {
    data object Loading : State685_11()
    data class Success(val data: String) : State685_11()
    data class Error(val message: String) : State685_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}