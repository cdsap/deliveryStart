package com.awesomeapp.mediafeed

sealed class State439_60 {
    data object Loading : State439_60()
    data class Success(val data: String) : State439_60()
    data class Error(val message: String) : State439_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}