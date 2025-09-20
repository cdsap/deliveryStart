package com.awesomeapp.contactfeed

sealed class State394_48 {
    data object Loading : State394_48()
    data class Success(val data: String) : State394_48()
    data class Error(val message: String) : State394_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}