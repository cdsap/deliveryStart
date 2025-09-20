package com.awesomeapp.timerpost

sealed class State522_79 {
    data object Loading : State522_79()
    data class Success(val data: String) : State522_79()
    data class Error(val message: String) : State522_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}