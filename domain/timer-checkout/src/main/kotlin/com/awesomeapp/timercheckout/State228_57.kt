package com.awesomeapp.timercheckout

sealed class State228_57 {
    data object Loading : State228_57()
    data class Success(val data: String) : State228_57()
    data class Error(val message: String) : State228_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}