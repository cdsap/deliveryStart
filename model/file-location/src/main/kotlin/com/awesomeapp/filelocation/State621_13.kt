package com.awesomeapp.filelocation

sealed class State621_13 {
    data object Loading : State621_13()
    data class Success(val data: String) : State621_13()
    data class Error(val message: String) : State621_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}