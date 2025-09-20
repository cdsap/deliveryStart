package com.awesomeapp.profilepost

sealed class State498_28 {
    data object Loading : State498_28()
    data class Success(val data: String) : State498_28()
    data class Error(val message: String) : State498_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}