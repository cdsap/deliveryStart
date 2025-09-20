package com.awesomeapp.timercomment

sealed class State473_102 {
    data object Loading : State473_102()
    data class Success(val data: String) : State473_102()
    data class Error(val message: String) : State473_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}