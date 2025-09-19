package com.awesomeapp.contactcheckout

sealed class State198_25 {
    data object Loading : State198_25()
    data class Success(val data: String) : State198_25()
    data class Error(val message: String) : State198_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}