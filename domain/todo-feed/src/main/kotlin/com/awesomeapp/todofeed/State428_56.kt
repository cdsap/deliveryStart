package com.awesomeapp.todofeed

sealed class State428_56 {
    data object Loading : State428_56()
    data class Success(val data: String) : State428_56()
    data class Error(val message: String) : State428_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}