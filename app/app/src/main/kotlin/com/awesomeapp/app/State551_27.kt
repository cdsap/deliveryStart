package com.awesomeapp.app

sealed class State551_27 {
    data object Loading : State551_27()
    data class Success(val data: String) : State551_27()
    data class Error(val message: String) : State551_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}