package com.awesomeapp.contactfeed

sealed class State394_66 {
    data object Loading : State394_66()
    data class Success(val data: String) : State394_66()
    data class Error(val message: String) : State394_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}