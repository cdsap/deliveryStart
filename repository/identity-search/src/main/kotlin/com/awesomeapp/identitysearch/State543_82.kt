package com.awesomeapp.identitysearch

sealed class State543_82 {
    data object Loading : State543_82()
    data class Success(val data: String) : State543_82()
    data class Error(val message: String) : State543_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}