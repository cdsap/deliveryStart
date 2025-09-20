package com.awesomeapp.pushshare

sealed class State736_14 {
    data object Loading : State736_14()
    data class Success(val data: String) : State736_14()
    data class Error(val message: String) : State736_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}