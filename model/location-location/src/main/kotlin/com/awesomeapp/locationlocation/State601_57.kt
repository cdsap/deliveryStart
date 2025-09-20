package com.awesomeapp.locationlocation

sealed class State601_57 {
    data object Loading : State601_57()
    data class Success(val data: String) : State601_57()
    data class Error(val message: String) : State601_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}