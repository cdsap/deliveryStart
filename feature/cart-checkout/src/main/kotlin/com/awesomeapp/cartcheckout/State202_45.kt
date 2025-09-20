package com.awesomeapp.cartcheckout

sealed class State202_45 {
    data object Loading : State202_45()
    data class Success(val data: String) : State202_45()
    data class Error(val message: String) : State202_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}