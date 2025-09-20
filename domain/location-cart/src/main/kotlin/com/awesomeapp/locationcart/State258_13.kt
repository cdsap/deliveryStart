package com.awesomeapp.locationcart

sealed class State258_13 {
    data object Loading : State258_13()
    data class Success(val data: String) : State258_13()
    data class Error(val message: String) : State258_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}