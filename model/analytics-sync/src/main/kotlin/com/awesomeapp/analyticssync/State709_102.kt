package com.awesomeapp.analyticssync

sealed class State709_102 {
    data object Loading : State709_102()
    data class Success(val data: String) : State709_102()
    data class Error(val message: String) : State709_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}