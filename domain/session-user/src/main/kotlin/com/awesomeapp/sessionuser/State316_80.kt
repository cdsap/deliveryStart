package com.awesomeapp.sessionuser

sealed class State316_80 {
    data object Loading : State316_80()
    data class Success(val data: String) : State316_80()
    data class Error(val message: String) : State316_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}