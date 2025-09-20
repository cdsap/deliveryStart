package com.awesomeapp.locationnetwork

sealed class State650_80 {
    data object Loading : State650_80()
    data class Success(val data: String) : State650_80()
    data class Error(val message: String) : State650_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}