package com.awesomeapp.taskprofile

sealed class State371_111 {
    data object Loading : State371_111()
    data class Success(val data: String) : State371_111()
    data class Error(val message: String) : State371_111()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}