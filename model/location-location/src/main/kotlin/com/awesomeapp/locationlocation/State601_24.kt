package com.awesomeapp.locationlocation

sealed class State601_24 {
    data object Loading : State601_24()
    data class Success(val data: String) : State601_24()
    data class Error(val message: String) : State601_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}