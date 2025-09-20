package com.awesomeapp.networkpost

sealed class State504_24 {
    data object Loading : State504_24()
    data class Success(val data: String) : State504_24()
    data class Error(val message: String) : State504_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}