package com.awesomeapp.commentlocation

sealed class State598_24 {
    data object Loading : State598_24()
    data class Success(val data: String) : State598_24()
    data class Error(val message: String) : State598_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}