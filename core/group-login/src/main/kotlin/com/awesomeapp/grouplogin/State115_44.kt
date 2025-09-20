package com.awesomeapp.grouplogin

sealed class State115_44 {
    data object Loading : State115_44()
    data class Success(val data: String) : State115_44()
    data class Error(val message: String) : State115_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}