package com.awesomeapp.taskpost

sealed class State518_18 {
    data object Loading : State518_18()
    data class Success(val data: String) : State518_18()
    data class Error(val message: String) : State518_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}