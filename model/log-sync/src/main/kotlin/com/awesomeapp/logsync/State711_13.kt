package com.awesomeapp.logsync

sealed class State711_13 {
    data object Loading : State711_13()
    data class Success(val data: String) : State711_13()
    data class Error(val message: String) : State711_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}