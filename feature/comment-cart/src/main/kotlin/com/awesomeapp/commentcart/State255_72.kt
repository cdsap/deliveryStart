package com.awesomeapp.commentcart

sealed class State255_72 {
    data object Loading : State255_72()
    data class Success(val data: String) : State255_72()
    data class Error(val message: String) : State255_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}