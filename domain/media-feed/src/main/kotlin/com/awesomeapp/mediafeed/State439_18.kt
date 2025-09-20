package com.awesomeapp.mediafeed

sealed class State439_18 {
    data object Loading : State439_18()
    data class Success(val data: String) : State439_18()
    data class Error(val message: String) : State439_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}