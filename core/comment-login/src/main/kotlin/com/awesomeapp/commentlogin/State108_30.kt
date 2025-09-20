package com.awesomeapp.commentlogin

sealed class State108_30 {
    data object Loading : State108_30()
    data class Success(val data: String) : State108_30()
    data class Error(val message: String) : State108_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}