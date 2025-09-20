package com.awesomeapp.locationlogin

sealed class State111_31 {
    data object Loading : State111_31()
    data class Success(val data: String) : State111_31()
    data class Error(val message: String) : State111_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}