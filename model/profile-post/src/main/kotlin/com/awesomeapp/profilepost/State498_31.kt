package com.awesomeapp.profilepost

sealed class State498_31 {
    data object Loading : State498_31()
    data class Success(val data: String) : State498_31()
    data class Error(val message: String) : State498_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}