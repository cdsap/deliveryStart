package com.awesomeapp.contactsearch

sealed class State541_48 {
    data object Loading : State541_48()
    data class Success(val data: String) : State541_48()
    data class Error(val message: String) : State541_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}