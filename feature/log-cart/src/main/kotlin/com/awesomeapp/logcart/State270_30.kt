package com.awesomeapp.logcart

sealed class State270_30 {
    data object Loading : State270_30()
    data class Success(val data: String) : State270_30()
    data class Error(val message: String) : State270_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}