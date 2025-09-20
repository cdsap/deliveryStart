package com.awesomeapp.postcomment

sealed class State452_89 {
    data object Loading : State452_89()
    data class Success(val data: String) : State452_89()
    data class Error(val message: String) : State452_89()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}