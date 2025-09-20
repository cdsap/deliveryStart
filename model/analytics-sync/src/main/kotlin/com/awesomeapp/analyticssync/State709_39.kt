package com.awesomeapp.analyticssync

sealed class State709_39 {
    data object Loading : State709_39()
    data class Success(val data: String) : State709_39()
    data class Error(val message: String) : State709_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}