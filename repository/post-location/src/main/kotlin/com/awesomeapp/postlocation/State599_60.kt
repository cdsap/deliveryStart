package com.awesomeapp.postlocation

sealed class State599_60 {
    data object Loading : State599_60()
    data class Success(val data: String) : State599_60()
    data class Error(val message: String) : State599_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}