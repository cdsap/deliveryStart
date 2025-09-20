package com.awesomeapp.medialogin

sealed class State145_44 {
    data object Loading : State145_44()
    data class Success(val data: String) : State145_44()
    data class Error(val message: String) : State145_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}