package com.awesomeapp.identitysearch

sealed class State543_67 {
    data object Loading : State543_67()
    data class Success(val data: String) : State543_67()
    data class Error(val message: String) : State543_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}