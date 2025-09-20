package com.awesomeapp.contactshare

sealed class State737_60 {
    data object Loading : State737_60()
    data class Success(val data: String) : State737_60()
    data class Error(val message: String) : State737_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}