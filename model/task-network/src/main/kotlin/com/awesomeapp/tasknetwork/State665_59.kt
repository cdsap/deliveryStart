package com.awesomeapp.tasknetwork

sealed class State665_59 {
    data object Loading : State665_59()
    data class Success(val data: String) : State665_59()
    data class Error(val message: String) : State665_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}