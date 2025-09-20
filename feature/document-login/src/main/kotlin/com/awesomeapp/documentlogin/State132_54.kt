package com.awesomeapp.documentlogin

sealed class State132_54 {
    data object Loading : State132_54()
    data class Success(val data: String) : State132_54()
    data class Error(val message: String) : State132_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}