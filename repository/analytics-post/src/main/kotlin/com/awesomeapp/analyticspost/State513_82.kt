package com.awesomeapp.analyticspost

sealed class State513_82 {
    data object Loading : State513_82()
    data class Success(val data: String) : State513_82()
    data class Error(val message: String) : State513_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}