package com.awesomeapp.statuslocation

sealed class State614_69 {
    data object Loading : State614_69()
    data class Success(val data: String) : State614_69()
    data class Error(val message: String) : State614_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}