package com.awesomeapp.statuscomment

sealed class State467_24 {
    data object Loading : State467_24()
    data class Success(val data: String) : State467_24()
    data class Error(val message: String) : State467_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}