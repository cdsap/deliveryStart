package com.awesomeapp.networkprofile

sealed class State357_67 {
    data object Loading : State357_67()
    data class Success(val data: String) : State357_67()
    data class Error(val message: String) : State357_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}