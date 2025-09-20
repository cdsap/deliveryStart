package com.awesomeapp.identitysearch

sealed class State543_70 {
    data object Loading : State543_70()
    data class Success(val data: String) : State543_70()
    data class Error(val message: String) : State543_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}