package com.awesomeapp.photocart

sealed class State290_71 {
    data object Loading : State290_71()
    data class Success(val data: String) : State290_71()
    data class Error(val message: String) : State290_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}