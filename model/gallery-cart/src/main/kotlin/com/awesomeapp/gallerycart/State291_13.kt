package com.awesomeapp.gallerycart

sealed class State291_13 {
    data object Loading : State291_13()
    data class Success(val data: String) : State291_13()
    data class Error(val message: String) : State291_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}