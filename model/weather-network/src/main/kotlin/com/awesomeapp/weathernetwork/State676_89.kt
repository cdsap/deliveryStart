package com.awesomeapp.weathernetwork

sealed class State676_89 {
    data object Loading : State676_89()
    data class Success(val data: String) : State676_89()
    data class Error(val message: String) : State676_89()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}