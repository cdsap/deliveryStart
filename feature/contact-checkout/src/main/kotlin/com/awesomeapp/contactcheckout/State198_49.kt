package com.awesomeapp.contactcheckout

sealed class State198_49 {
    data object Loading : State198_49()
    data class Success(val data: String) : State198_49()
    data class Error(val message: String) : State198_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}