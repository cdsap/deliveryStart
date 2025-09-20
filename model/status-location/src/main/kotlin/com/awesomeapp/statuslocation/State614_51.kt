package com.awesomeapp.statuslocation

sealed class State614_51 {
    data object Loading : State614_51()
    data class Success(val data: String) : State614_51()
    data class Error(val message: String) : State614_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}