package com.awesomeapp.feedcheckout

sealed class State205_65 {
    data object Loading : State205_65()
    data class Success(val data: String) : State205_65()
    data class Error(val message: String) : State205_65()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}