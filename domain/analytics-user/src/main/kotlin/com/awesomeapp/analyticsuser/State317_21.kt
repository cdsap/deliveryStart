package com.awesomeapp.analyticsuser

sealed class State317_21 {
    data object Loading : State317_21()
    data class Success(val data: String) : State317_21()
    data class Error(val message: String) : State317_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}