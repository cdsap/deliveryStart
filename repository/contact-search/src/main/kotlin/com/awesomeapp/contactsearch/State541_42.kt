package com.awesomeapp.contactsearch

sealed class State541_42 {
    data object Loading : State541_42()
    data class Success(val data: String) : State541_42()
    data class Error(val message: String) : State541_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}