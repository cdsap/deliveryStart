package com.awesomeapp.eventcheckout

sealed class State226_21 {
    data object Loading : State226_21()
    data class Success(val data: String) : State226_21()
    data class Error(val message: String) : State226_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}