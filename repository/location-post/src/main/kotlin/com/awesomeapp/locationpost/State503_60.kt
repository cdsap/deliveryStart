package com.awesomeapp.locationpost

sealed class State503_60 {
    data object Loading : State503_60()
    data class Success(val data: String) : State503_60()
    data class Error(val message: String) : State503_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}