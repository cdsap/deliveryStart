package com.awesomeapp.alarm

sealed class State31_24 {
    data object Loading : State31_24()
    data class Success(val data: String) : State31_24()
    data class Error(val message: String) : State31_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}