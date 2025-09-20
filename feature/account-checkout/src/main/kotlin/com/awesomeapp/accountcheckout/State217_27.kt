package com.awesomeapp.accountcheckout

sealed class State217_27 {
    data object Loading : State217_27()
    data class Success(val data: String) : State217_27()
    data class Error(val message: String) : State217_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}