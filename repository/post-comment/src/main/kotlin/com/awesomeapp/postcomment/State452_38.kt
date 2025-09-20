package com.awesomeapp.postcomment

sealed class State452_38 {
    data object Loading : State452_38()
    data class Success(val data: String) : State452_38()
    data class Error(val message: String) : State452_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}