package com.awesomeapp.pushuser

sealed class State295_74 {
    data object Loading : State295_74()
    data class Success(val data: String) : State295_74()
    data class Error(val message: String) : State295_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}