package com.awesomeapp.articlelogin

sealed class State140_37 {
    data object Loading : State140_37()
    data class Success(val data: String) : State140_37()
    data class Error(val message: String) : State140_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}