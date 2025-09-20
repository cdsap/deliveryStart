package com.awesomeapp.mediafeed

sealed class State439_39 {
    data object Loading : State439_39()
    data class Success(val data: String) : State439_39()
    data class Error(val message: String) : State439_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}