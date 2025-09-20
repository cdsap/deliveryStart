package com.awesomeapp.listprofile

sealed class State380_115 {
    data object Loading : State380_115()
    data class Success(val data: String) : State380_115()
    data class Error(val message: String) : State380_115()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}