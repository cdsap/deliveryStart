package com.awesomeapp.forecastcomment

sealed class State481_126 {
    data object Loading : State481_126()
    data class Success(val data: String) : State481_126()
    data class Error(val message: String) : State481_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}