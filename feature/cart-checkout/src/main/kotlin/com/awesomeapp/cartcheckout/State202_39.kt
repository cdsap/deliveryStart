package com.awesomeapp.cartcheckout

sealed class State202_39 {
    data object Loading : State202_39()
    data class Success(val data: String) : State202_39()
    data class Error(val message: String) : State202_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}