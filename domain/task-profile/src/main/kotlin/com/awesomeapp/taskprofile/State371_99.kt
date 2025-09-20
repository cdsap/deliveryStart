package com.awesomeapp.taskprofile

sealed class State371_99 {
    data object Loading : State371_99()
    data class Success(val data: String) : State371_99()
    data class Error(val message: String) : State371_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}