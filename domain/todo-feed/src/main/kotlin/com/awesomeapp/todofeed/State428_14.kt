package com.awesomeapp.todofeed

sealed class State428_14 {
    data object Loading : State428_14()
    data class Success(val data: String) : State428_14()
    data class Error(val message: String) : State428_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}