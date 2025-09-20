package com.awesomeapp.locationcart

sealed class State258_37 {
    data object Loading : State258_37()
    data class Success(val data: String) : State258_37()
    data class Error(val message: String) : State258_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}