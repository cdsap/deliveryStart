package com.awesomeapp.log

sealed class State25_17 {
    data object Loading : State25_17()
    data class Success(val data: String) : State25_17()
    data class Error(val message: String) : State25_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}