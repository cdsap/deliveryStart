package com.awesomeapp.searchcomment

sealed class State453_58 {
    data object Loading : State453_58()
    data class Success(val data: String) : State453_58()
    data class Error(val message: String) : State453_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}