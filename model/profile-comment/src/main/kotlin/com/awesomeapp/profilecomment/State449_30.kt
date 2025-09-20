package com.awesomeapp.profilecomment

sealed class State449_30 {
    data object Loading : State449_30()
    data class Success(val data: String) : State449_30()
    data class Error(val message: String) : State449_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}