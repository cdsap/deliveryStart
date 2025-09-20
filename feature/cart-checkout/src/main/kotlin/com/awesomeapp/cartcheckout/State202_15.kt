package com.awesomeapp.cartcheckout

sealed class State202_15 {
    data object Loading : State202_15()
    data class Success(val data: String) : State202_15()
    data class Error(val message: String) : State202_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}