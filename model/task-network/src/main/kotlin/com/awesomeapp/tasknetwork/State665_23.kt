package com.awesomeapp.tasknetwork

sealed class State665_23 {
    data object Loading : State665_23()
    data class Success(val data: String) : State665_23()
    data class Error(val message: String) : State665_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}