package com.awesomeapp.weatherpost

sealed class State529_84 {
    data object Loading : State529_84()
    data class Success(val data: String) : State529_84()
    data class Error(val message: String) : State529_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}