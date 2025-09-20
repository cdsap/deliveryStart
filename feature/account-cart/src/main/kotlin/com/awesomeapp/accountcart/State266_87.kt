package com.awesomeapp.accountcart

sealed class State266_87 {
    data object Loading : State266_87()
    data class Success(val data: String) : State266_87()
    data class Error(val message: String) : State266_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}