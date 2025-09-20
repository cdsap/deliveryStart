package com.awesomeapp.todolocation

sealed class State624_36 {
    data object Loading : State624_36()
    data class Success(val data: String) : State624_36()
    data class Error(val message: String) : State624_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}