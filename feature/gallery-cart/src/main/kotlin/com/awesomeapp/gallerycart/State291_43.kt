package com.awesomeapp.gallerycart

sealed class State291_43 {
    data object Loading : State291_43()
    data class Success(val data: String) : State291_43()
    data class Error(val message: String) : State291_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}