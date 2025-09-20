package com.awesomeapp.mediaidentity

sealed class State194_39 {
    data object Loading : State194_39()
    data class Success(val data: String) : State194_39()
    data class Error(val message: String) : State194_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}