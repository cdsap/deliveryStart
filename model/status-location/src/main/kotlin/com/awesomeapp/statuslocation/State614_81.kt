package com.awesomeapp.statuslocation

sealed class State614_81 {
    data object Loading : State614_81()
    data class Success(val data: String) : State614_81()
    data class Error(val message: String) : State614_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}