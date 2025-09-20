package com.awesomeapp.commentnetwork

sealed class State647_48 {
    data object Loading : State647_48()
    data class Success(val data: String) : State647_48()
    data class Error(val message: String) : State647_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}