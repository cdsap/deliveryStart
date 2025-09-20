package com.awesomeapp.profilepost

sealed class State498_16 {
    data object Loading : State498_16()
    data class Success(val data: String) : State498_16()
    data class Error(val message: String) : State498_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}