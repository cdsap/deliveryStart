package com.awesomeapp.newscontact

sealed class State90_27 {
    data object Loading : State90_27()
    data class Success(val data: String) : State90_27()
    data class Error(val message: String) : State90_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}