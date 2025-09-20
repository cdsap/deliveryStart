package com.awesomeapp.mapcheckout

sealed class State234_37 {
    data object Loading : State234_37()
    data class Success(val data: String) : State234_37()
    data class Error(val message: String) : State234_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}