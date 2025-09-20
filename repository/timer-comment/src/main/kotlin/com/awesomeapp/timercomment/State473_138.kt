package com.awesomeapp.timercomment

sealed class State473_138 {
    data object Loading : State473_138()
    data class Success(val data: String) : State473_138()
    data class Error(val message: String) : State473_138()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}