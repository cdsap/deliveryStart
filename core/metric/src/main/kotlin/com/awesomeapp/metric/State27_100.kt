package com.awesomeapp.metric

sealed class State27_100 {
    data object Loading : State27_100()
    data class Success(val data: String) : State27_100()
    data class Error(val message: String) : State27_100()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}