package com.awesomeapp.audionetwork

sealed class State685_17 {
    data object Loading : State685_17()
    data class Success(val data: String) : State685_17()
    data class Error(val message: String) : State685_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}