package com.awesomeapp.sharecheckout

sealed class State212_11 {
    data object Loading : State212_11()
    data class Success(val data: String) : State212_11()
    data class Error(val message: String) : State212_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}