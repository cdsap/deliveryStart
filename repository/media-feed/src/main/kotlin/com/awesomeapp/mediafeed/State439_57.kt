package com.awesomeapp.mediafeed

sealed class State439_57 {
    data object Loading : State439_57()
    data class Success(val data: String) : State439_57()
    data class Error(val message: String) : State439_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}