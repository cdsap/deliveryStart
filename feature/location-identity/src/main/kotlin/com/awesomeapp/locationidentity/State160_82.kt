package com.awesomeapp.locationidentity

sealed class State160_82 {
    data object Loading : State160_82()
    data class Success(val data: String) : State160_82()
    data class Error(val message: String) : State160_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}