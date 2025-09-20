package com.awesomeapp.metric

sealed class State27_130 {
    data object Loading : State27_130()
    data class Success(val data: String) : State27_130()
    data class Error(val message: String) : State27_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}