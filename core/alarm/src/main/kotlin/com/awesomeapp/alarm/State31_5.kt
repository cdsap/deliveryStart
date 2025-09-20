package com.awesomeapp.alarm

sealed class State31_5 {
    data object Loading : State31_5()
    data class Success(val data: String) : State31_5()
    data class Error(val message: String) : State31_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}