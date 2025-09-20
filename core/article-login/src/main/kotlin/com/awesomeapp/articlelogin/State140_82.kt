package com.awesomeapp.articlelogin

sealed class State140_82 {
    data object Loading : State140_82()
    data class Success(val data: String) : State140_82()
    data class Error(val message: String) : State140_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}