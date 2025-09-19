package com.awesomeapp.useridentity

sealed class State154_24 {
    data object Loading : State154_24()
    data class Success(val data: String) : State154_24()
    data class Error(val message: String) : State154_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}