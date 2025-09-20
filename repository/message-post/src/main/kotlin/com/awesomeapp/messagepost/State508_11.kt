package com.awesomeapp.messagepost

sealed class State508_11 {
    data object Loading : State508_11()
    data class Success(val data: String) : State508_11()
    data class Error(val message: String) : State508_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}