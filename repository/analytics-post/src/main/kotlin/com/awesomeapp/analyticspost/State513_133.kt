package com.awesomeapp.analyticspost

sealed class State513_133 {
    data object Loading : State513_133()
    data class Success(val data: String) : State513_133()
    data class Error(val message: String) : State513_133()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}