package com.awesomeapp.searchcomment

sealed class State453_85 {
    data object Loading : State453_85()
    data class Success(val data: String) : State453_85()
    data class Error(val message: String) : State453_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}