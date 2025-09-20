package com.awesomeapp.sync

sealed class State15_24 {
    data object Loading : State15_24()
    data class Success(val data: String) : State15_24()
    data class Error(val message: String) : State15_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}