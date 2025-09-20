package com.awesomeapp.todonetwork

sealed class State673_93 {
    data object Loading : State673_93()
    data class Success(val data: String) : State673_93()
    data class Error(val message: String) : State673_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}