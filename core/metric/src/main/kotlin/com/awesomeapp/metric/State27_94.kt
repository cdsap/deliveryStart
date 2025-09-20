package com.awesomeapp.metric

sealed class State27_94 {
    data object Loading : State27_94()
    data class Success(val data: String) : State27_94()
    data class Error(val message: String) : State27_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}