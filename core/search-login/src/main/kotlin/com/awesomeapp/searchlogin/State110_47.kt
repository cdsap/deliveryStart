package com.awesomeapp.searchlogin

sealed class State110_47 {
    data object Loading : State110_47()
    data class Success(val data: String) : State110_47()
    data class Error(val message: String) : State110_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}