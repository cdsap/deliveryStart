package com.awesomeapp.tasksearch

sealed class State567_139 {
    data object Loading : State567_139()
    data class Success(val data: String) : State567_139()
    data class Error(val message: String) : State567_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}