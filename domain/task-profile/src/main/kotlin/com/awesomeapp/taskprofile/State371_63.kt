package com.awesomeapp.taskprofile

sealed class State371_63 {
    data object Loading : State371_63()
    data class Success(val data: String) : State371_63()
    data class Error(val message: String) : State371_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}