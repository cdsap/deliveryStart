package com.awesomeapp.commentcart

sealed class State255_27 {
    data object Loading : State255_27()
    data class Success(val data: String) : State255_27()
    data class Error(val message: String) : State255_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}