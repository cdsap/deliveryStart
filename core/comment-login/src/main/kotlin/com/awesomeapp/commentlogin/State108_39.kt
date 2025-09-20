package com.awesomeapp.commentlogin

sealed class State108_39 {
    data object Loading : State108_39()
    data class Success(val data: String) : State108_39()
    data class Error(val message: String) : State108_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}