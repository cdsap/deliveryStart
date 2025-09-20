package com.awesomeapp.taskprofile

sealed class State371_84 {
    data object Loading : State371_84()
    data class Success(val data: String) : State371_84()
    data class Error(val message: String) : State371_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}