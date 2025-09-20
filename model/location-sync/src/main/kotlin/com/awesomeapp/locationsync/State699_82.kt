package com.awesomeapp.locationsync

sealed class State699_82 {
    data object Loading : State699_82()
    data class Success(val data: String) : State699_82()
    data class Error(val message: String) : State699_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}