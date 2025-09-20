package com.awesomeapp.commentlogin

sealed class State108_51 {
    data object Loading : State108_51()
    data class Success(val data: String) : State108_51()
    data class Error(val message: String) : State108_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}