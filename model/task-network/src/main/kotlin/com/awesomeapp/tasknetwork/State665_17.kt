package com.awesomeapp.tasknetwork

sealed class State665_17 {
    data object Loading : State665_17()
    data class Success(val data: String) : State665_17()
    data class Error(val message: String) : State665_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}