package com.awesomeapp.timercomment

sealed class State473_90 {
    data object Loading : State473_90()
    data class Success(val data: String) : State473_90()
    data class Error(val message: String) : State473_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}