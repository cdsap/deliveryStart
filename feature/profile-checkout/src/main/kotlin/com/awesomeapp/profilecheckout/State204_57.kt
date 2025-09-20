package com.awesomeapp.profilecheckout

sealed class State204_57 {
    data object Loading : State204_57()
    data class Success(val data: String) : State204_57()
    data class Error(val message: String) : State204_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}