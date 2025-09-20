package com.awesomeapp.weatherpost

sealed class State529_15 {
    data object Loading : State529_15()
    data class Success(val data: String) : State529_15()
    data class Error(val message: String) : State529_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}