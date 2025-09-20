package com.awesomeapp.checkoutsearch

sealed class State544_7 {
    data object Loading : State544_7()
    data class Success(val data: String) : State544_7()
    data class Error(val message: String) : State544_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}