package com.awesomeapp.shareuser

sealed class State310_56 {
    data object Loading : State310_56()
    data class Success(val data: String) : State310_56()
    data class Error(val message: String) : State310_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}