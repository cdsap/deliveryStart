package com.awesomeapp.checkoutlocation

sealed class State593_81 {
    data object Loading : State593_81()
    data class Success(val data: String) : State593_81()
    data class Error(val message: String) : State593_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}