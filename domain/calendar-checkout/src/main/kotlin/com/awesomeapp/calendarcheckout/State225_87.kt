package com.awesomeapp.calendarcheckout

sealed class State225_87 {
    data object Loading : State225_87()
    data class Success(val data: String) : State225_87()
    data class Error(val message: String) : State225_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}