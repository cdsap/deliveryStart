package com.awesomeapp.locationcart

sealed class State258_49 {
    data object Loading : State258_49()
    data class Success(val data: String) : State258_49()
    data class Error(val message: String) : State258_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}