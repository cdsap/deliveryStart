package com.awesomeapp.todonetwork

sealed class State673_111 {
    data object Loading : State673_111()
    data class Success(val data: String) : State673_111()
    data class Error(val message: String) : State673_111()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}