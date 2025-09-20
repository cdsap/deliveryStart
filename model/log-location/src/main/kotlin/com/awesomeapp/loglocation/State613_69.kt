package com.awesomeapp.loglocation

sealed class State613_69 {
    data object Loading : State613_69()
    data class Success(val data: String) : State613_69()
    data class Error(val message: String) : State613_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}