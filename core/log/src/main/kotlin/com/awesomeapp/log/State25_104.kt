package com.awesomeapp.log

sealed class State25_104 {
    data object Loading : State25_104()
    data class Success(val data: String) : State25_104()
    data class Error(val message: String) : State25_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}