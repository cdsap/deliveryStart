package com.awesomeapp.contactcheckout

sealed class State198_79 {
    data object Loading : State198_79()
    data class Success(val data: String) : State198_79()
    data class Error(val message: String) : State198_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}