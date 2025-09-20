package com.awesomeapp.groupnetwork

sealed class State654_64 {
    data object Loading : State654_64()
    data class Success(val data: String) : State654_64()
    data class Error(val message: String) : State654_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}