package com.awesomeapp.weatherpost

sealed class State529_51 {
    data object Loading : State529_51()
    data class Success(val data: String) : State529_51()
    data class Error(val message: String) : State529_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}