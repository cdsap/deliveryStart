package com.awesomeapp.timercomment

sealed class State473_36 {
    data object Loading : State473_36()
    data class Success(val data: String) : State473_36()
    data class Error(val message: String) : State473_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}