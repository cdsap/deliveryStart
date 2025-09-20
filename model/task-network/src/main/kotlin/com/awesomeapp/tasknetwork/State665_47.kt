package com.awesomeapp.tasknetwork

sealed class State665_47 {
    data object Loading : State665_47()
    data class Success(val data: String) : State665_47()
    data class Error(val message: String) : State665_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}