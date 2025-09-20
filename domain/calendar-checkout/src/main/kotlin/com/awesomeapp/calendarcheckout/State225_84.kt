package com.awesomeapp.calendarcheckout

sealed class State225_84 {
    data object Loading : State225_84()
    data class Success(val data: String) : State225_84()
    data class Error(val message: String) : State225_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}