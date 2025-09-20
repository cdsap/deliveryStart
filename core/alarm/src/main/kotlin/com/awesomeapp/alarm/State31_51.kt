package com.awesomeapp.alarm

sealed class State31_51 {
    data object Loading : State31_51()
    data class Success(val data: String) : State31_51()
    data class Error(val message: String) : State31_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}