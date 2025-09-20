package com.awesomeapp.gallerycart

sealed class State291_85 {
    data object Loading : State291_85()
    data class Success(val data: String) : State291_85()
    data class Error(val message: String) : State291_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}