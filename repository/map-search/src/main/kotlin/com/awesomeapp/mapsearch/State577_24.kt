package com.awesomeapp.mapsearch

sealed class State577_24 {
    data object Loading : State577_24()
    data class Success(val data: String) : State577_24()
    data class Error(val message: String) : State577_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}