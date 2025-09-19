package com.awesomeapp.logincheckout

sealed class State199_24 {
    data object Loading : State199_24()
    data class Success(val data: String) : State199_24()
    data class Error(val message: String) : State199_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}