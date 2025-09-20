package com.awesomeapp.articleuser

sealed class State336_15 {
    data object Loading : State336_15()
    data class Success(val data: String) : State336_15()
    data class Error(val message: String) : State336_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}