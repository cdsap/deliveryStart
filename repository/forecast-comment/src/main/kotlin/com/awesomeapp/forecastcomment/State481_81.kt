package com.awesomeapp.forecastcomment

sealed class State481_81 {
    data object Loading : State481_81()
    data class Success(val data: String) : State481_81()
    data class Error(val message: String) : State481_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}