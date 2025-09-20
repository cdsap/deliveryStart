package com.awesomeapp.timercheckout

sealed class State228_48 {
    data object Loading : State228_48()
    data class Success(val data: String) : State228_48()
    data class Error(val message: String) : State228_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}