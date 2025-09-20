package com.awesomeapp.audiocheckout

sealed class State244_23 {
    data object Loading : State244_23()
    data class Success(val data: String) : State244_23()
    data class Error(val message: String) : State244_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}