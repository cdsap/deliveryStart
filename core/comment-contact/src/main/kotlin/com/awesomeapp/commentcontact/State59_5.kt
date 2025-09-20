package com.awesomeapp.commentcontact

sealed class State59_5 {
    data object Loading : State59_5()
    data class Success(val data: String) : State59_5()
    data class Error(val message: String) : State59_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}