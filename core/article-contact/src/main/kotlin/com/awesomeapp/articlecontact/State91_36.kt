package com.awesomeapp.articlecontact

sealed class State91_36 {
    data object Loading : State91_36()
    data class Success(val data: String) : State91_36()
    data class Error(val message: String) : State91_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}