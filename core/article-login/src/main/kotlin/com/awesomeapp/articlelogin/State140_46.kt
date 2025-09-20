package com.awesomeapp.articlelogin

sealed class State140_46 {
    data object Loading : State140_46()
    data class Success(val data: String) : State140_46()
    data class Error(val message: String) : State140_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}