package com.awesomeapp.gallerycart

sealed class State291_73 {
    data object Loading : State291_73()
    data class Success(val data: String) : State291_73()
    data class Error(val message: String) : State291_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}