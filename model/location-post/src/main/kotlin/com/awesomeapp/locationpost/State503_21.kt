package com.awesomeapp.locationpost

sealed class State503_21 {
    data object Loading : State503_21()
    data class Success(val data: String) : State503_21()
    data class Error(val message: String) : State503_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}