package com.awesomeapp.pushlogin

sealed class State99_91 {
    data object Loading : State99_91()
    data class Success(val data: String) : State99_91()
    data class Error(val message: String) : State99_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}