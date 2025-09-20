package com.awesomeapp.mapsearch

sealed class State577_33 {
    data object Loading : State577_33()
    data class Success(val data: String) : State577_33()
    data class Error(val message: String) : State577_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}