package com.awesomeapp.logcart

sealed class State270_24 {
    data object Loading : State270_24()
    data class Success(val data: String) : State270_24()
    data class Error(val message: String) : State270_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}