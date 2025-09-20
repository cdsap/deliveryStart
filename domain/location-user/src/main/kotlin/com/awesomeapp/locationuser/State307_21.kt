package com.awesomeapp.locationuser

sealed class State307_21 {
    data object Loading : State307_21()
    data class Success(val data: String) : State307_21()
    data class Error(val message: String) : State307_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}