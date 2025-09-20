package com.awesomeapp.logincheckout

sealed class State199_63 {
    data object Loading : State199_63()
    data class Success(val data: String) : State199_63()
    data class Error(val message: String) : State199_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}