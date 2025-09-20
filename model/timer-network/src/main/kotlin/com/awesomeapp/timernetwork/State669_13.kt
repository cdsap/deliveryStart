package com.awesomeapp.timernetwork

sealed class State669_13 {
    data object Loading : State669_13()
    data class Success(val data: String) : State669_13()
    data class Error(val message: String) : State669_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}