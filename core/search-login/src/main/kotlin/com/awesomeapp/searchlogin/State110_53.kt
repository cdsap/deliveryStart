package com.awesomeapp.searchlogin

sealed class State110_53 {
    data object Loading : State110_53()
    data class Success(val data: String) : State110_53()
    data class Error(val message: String) : State110_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}