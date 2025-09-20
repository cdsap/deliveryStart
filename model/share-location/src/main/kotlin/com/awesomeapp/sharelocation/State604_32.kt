package com.awesomeapp.sharelocation

sealed class State604_32 {
    data object Loading : State604_32()
    data class Success(val data: String) : State604_32()
    data class Error(val message: String) : State604_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}