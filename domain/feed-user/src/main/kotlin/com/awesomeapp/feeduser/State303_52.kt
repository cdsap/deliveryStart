package com.awesomeapp.feeduser

sealed class State303_52 {
    data object Loading : State303_52()
    data class Success(val data: String) : State303_52()
    data class Error(val message: String) : State303_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}