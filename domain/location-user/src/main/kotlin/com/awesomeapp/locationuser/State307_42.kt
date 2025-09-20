package com.awesomeapp.locationuser

sealed class State307_42 {
    data object Loading : State307_42()
    data class Success(val data: String) : State307_42()
    data class Error(val message: String) : State307_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}