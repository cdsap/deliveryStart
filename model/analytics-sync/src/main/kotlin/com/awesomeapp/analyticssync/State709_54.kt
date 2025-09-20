package com.awesomeapp.analyticssync

sealed class State709_54 {
    data object Loading : State709_54()
    data class Success(val data: String) : State709_54()
    data class Error(val message: String) : State709_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}