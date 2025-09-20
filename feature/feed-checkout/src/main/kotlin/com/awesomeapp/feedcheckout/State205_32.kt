package com.awesomeapp.feedcheckout

sealed class State205_32 {
    data object Loading : State205_32()
    data class Success(val data: String) : State205_32()
    data class Error(val message: String) : State205_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}