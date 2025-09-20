package com.awesomeapp.commentcart

sealed class State255_36 {
    data object Loading : State255_36()
    data class Success(val data: String) : State255_36()
    data class Error(val message: String) : State255_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}