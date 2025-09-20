package com.awesomeapp.photocart

sealed class State290_38 {
    data object Loading : State290_38()
    data class Success(val data: String) : State290_38()
    data class Error(val message: String) : State290_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}