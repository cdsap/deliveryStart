package com.awesomeapp.postpost

sealed class State501_43 {
    data object Loading : State501_43()
    data class Success(val data: String) : State501_43()
    data class Error(val message: String) : State501_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}