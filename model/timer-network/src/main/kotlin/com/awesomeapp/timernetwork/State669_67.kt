package com.awesomeapp.timernetwork

sealed class State669_67 {
    data object Loading : State669_67()
    data class Success(val data: String) : State669_67()
    data class Error(val message: String) : State669_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}