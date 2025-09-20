package com.awesomeapp.articleuser

sealed class State336_21 {
    data object Loading : State336_21()
    data class Success(val data: String) : State336_21()
    data class Error(val message: String) : State336_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}