package com.awesomeapp.checkoutsearch

sealed class State544_20 {
    data object Loading : State544_20()
    data class Success(val data: String) : State544_20()
    data class Error(val message: String) : State544_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}