package com.awesomeapp.newslocation

sealed class State629_57 {
    data object Loading : State629_57()
    data class Success(val data: String) : State629_57()
    data class Error(val message: String) : State629_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}