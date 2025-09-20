package com.awesomeapp.useridentity

sealed class State154_51 {
    data object Loading : State154_51()
    data class Success(val data: String) : State154_51()
    data class Error(val message: String) : State154_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}