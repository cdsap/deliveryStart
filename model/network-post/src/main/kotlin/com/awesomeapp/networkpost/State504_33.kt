package com.awesomeapp.networkpost

sealed class State504_33 {
    data object Loading : State504_33()
    data class Success(val data: String) : State504_33()
    data class Error(val message: String) : State504_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}