package com.awesomeapp.calendarcart

sealed class State274_21 {
    data object Loading : State274_21()
    data class Success(val data: String) : State274_21()
    data class Error(val message: String) : State274_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}