package com.awesomeapp.contactsearch

sealed class State541_51 {
    data object Loading : State541_51()
    data class Success(val data: String) : State541_51()
    data class Error(val message: String) : State541_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}