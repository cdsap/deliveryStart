package com.awesomeapp.tasksearch

sealed class State567_40 {
    data object Loading : State567_40()
    data class Success(val data: String) : State567_40()
    data class Error(val message: String) : State567_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}