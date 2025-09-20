package com.awesomeapp.profilecheckout

sealed class State204_69 {
    data object Loading : State204_69()
    data class Success(val data: String) : State204_69()
    data class Error(val message: String) : State204_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}