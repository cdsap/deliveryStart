package com.awesomeapp.pushfeed

sealed class State393_25 {
    data object Loading : State393_25()
    data class Success(val data: String) : State393_25()
    data class Error(val message: String) : State393_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}