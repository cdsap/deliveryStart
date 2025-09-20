package com.awesomeapp.logcomment

sealed class State466_93 {
    data object Loading : State466_93()
    data class Success(val data: String) : State466_93()
    data class Error(val message: String) : State466_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}