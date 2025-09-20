package com.awesomeapp.metric

sealed class State27_118 {
    data object Loading : State27_118()
    data class Success(val data: String) : State27_118()
    data class Error(val message: String) : State27_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}