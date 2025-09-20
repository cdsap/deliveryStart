package com.awesomeapp.commentlogin

sealed class State108_78 {
    data object Loading : State108_78()
    data class Success(val data: String) : State108_78()
    data class Error(val message: String) : State108_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}