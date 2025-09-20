package com.awesomeapp.analyticsuser

sealed class State317_27 {
    data object Loading : State317_27()
    data class Success(val data: String) : State317_27()
    data class Error(val message: String) : State317_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}