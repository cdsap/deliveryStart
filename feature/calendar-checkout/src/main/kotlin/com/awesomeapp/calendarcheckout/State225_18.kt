package com.awesomeapp.calendarcheckout

sealed class State225_18 {
    data object Loading : State225_18()
    data class Success(val data: String) : State225_18()
    data class Error(val message: String) : State225_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}