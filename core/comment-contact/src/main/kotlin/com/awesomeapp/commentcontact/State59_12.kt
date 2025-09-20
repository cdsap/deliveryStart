package com.awesomeapp.commentcontact

sealed class State59_12 {
    data object Loading : State59_12()
    data class Success(val data: String) : State59_12()
    data class Error(val message: String) : State59_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}