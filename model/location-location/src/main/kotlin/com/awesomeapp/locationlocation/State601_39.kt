package com.awesomeapp.locationlocation

sealed class State601_39 {
    data object Loading : State601_39()
    data class Success(val data: String) : State601_39()
    data class Error(val message: String) : State601_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}