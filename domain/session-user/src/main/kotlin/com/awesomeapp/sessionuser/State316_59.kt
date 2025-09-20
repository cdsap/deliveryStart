package com.awesomeapp.sessionuser

sealed class State316_59 {
    data object Loading : State316_59()
    data class Success(val data: String) : State316_59()
    data class Error(val message: String) : State316_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}