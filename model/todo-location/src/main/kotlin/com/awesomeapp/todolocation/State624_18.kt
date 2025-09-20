package com.awesomeapp.todolocation

sealed class State624_18 {
    data object Loading : State624_18()
    data class Success(val data: String) : State624_18()
    data class Error(val message: String) : State624_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}