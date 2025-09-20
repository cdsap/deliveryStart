package com.awesomeapp.todofeed

sealed class State428_128 {
    data object Loading : State428_128()
    data class Success(val data: String) : State428_128()
    data class Error(val message: String) : State428_128()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}