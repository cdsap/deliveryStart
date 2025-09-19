package com.awesomeapp.analyticsuser

sealed class State317_18 {
    data object Loading : State317_18()
    data class Success(val data: String) : State317_18()
    data class Error(val message: String) : State317_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}