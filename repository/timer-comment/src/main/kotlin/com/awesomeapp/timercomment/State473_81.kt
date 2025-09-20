package com.awesomeapp.timercomment

sealed class State473_81 {
    data object Loading : State473_81()
    data class Success(val data: String) : State473_81()
    data class Error(val message: String) : State473_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}