package com.awesomeapp.timercheckout

sealed class State228_84 {
    data object Loading : State228_84()
    data class Success(val data: String) : State228_84()
    data class Error(val message: String) : State228_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}