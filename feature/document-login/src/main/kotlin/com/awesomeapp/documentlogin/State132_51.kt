package com.awesomeapp.documentlogin

sealed class State132_51 {
    data object Loading : State132_51()
    data class Success(val data: String) : State132_51()
    data class Error(val message: String) : State132_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}