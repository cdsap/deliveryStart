package com.awesomeapp.pushprofile

sealed class State344_17 {
    data object Loading : State344_17()
    data class Success(val data: String) : State344_17()
    data class Error(val message: String) : State344_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}