package com.awesomeapp.commentlocation

sealed class State598_105 {
    data object Loading : State598_105()
    data class Success(val data: String) : State598_105()
    data class Error(val message: String) : State598_105()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}