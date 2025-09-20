package com.awesomeapp.timerpost

sealed class State522_88 {
    data object Loading : State522_88()
    data class Success(val data: String) : State522_88()
    data class Error(val message: String) : State522_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}