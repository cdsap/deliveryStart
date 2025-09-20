package com.awesomeapp.photocart

sealed class State290_20 {
    data object Loading : State290_20()
    data class Success(val data: String) : State290_20()
    data class Error(val message: String) : State290_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}