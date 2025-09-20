package com.awesomeapp.mapsearch

sealed class State577_114 {
    data object Loading : State577_114()
    data class Success(val data: String) : State577_114()
    data class Error(val message: String) : State577_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}