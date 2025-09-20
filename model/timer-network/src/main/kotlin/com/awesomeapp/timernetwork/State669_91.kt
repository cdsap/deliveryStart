package com.awesomeapp.timernetwork

sealed class State669_91 {
    data object Loading : State669_91()
    data class Success(val data: String) : State669_91()
    data class Error(val message: String) : State669_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}