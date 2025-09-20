package com.awesomeapp.calendarcart

sealed class State274_36 {
    data object Loading : State274_36()
    data class Success(val data: String) : State274_36()
    data class Error(val message: String) : State274_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}