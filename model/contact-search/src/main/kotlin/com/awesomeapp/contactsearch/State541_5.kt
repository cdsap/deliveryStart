package com.awesomeapp.contactsearch

sealed class State541_5 {
    data object Loading : State541_5()
    data class Success(val data: String) : State541_5()
    data class Error(val message: String) : State541_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}