package com.awesomeapp.useridentity

sealed class State154_57 {
    data object Loading : State154_57()
    data class Success(val data: String) : State154_57()
    data class Error(val message: String) : State154_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}