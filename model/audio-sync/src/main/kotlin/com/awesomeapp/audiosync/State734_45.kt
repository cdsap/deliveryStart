package com.awesomeapp.audiosync

sealed class State734_45 {
    data object Loading : State734_45()
    data class Success(val data: String) : State734_45()
    data class Error(val message: String) : State734_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}