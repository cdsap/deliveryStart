package com.awesomeapp.tasknetwork

sealed class State665_32 {
    data object Loading : State665_32()
    data class Success(val data: String) : State665_32()
    data class Error(val message: String) : State665_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}