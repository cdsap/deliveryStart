package com.awesomeapp.todonetwork

sealed class State673_54 {
    data object Loading : State673_54()
    data class Success(val data: String) : State673_54()
    data class Error(val message: String) : State673_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}