package com.awesomeapp.listprofile

sealed class State380_127 {
    data object Loading : State380_127()
    data class Success(val data: String) : State380_127()
    data class Error(val message: String) : State380_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}