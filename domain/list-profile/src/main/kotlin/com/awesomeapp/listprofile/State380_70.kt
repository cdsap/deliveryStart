package com.awesomeapp.listprofile

sealed class State380_70 {
    data object Loading : State380_70()
    data class Success(val data: String) : State380_70()
    data class Error(val message: String) : State380_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}