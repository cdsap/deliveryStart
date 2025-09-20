package com.awesomeapp.pushshare

sealed class State736_71 {
    data object Loading : State736_71()
    data class Success(val data: String) : State736_71()
    data class Error(val message: String) : State736_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}