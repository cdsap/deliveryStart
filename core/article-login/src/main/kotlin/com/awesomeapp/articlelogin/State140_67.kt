package com.awesomeapp.articlelogin

sealed class State140_67 {
    data object Loading : State140_67()
    data class Success(val data: String) : State140_67()
    data class Error(val message: String) : State140_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}