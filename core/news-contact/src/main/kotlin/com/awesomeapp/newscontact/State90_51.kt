package com.awesomeapp.newscontact

sealed class State90_51 {
    data object Loading : State90_51()
    data class Success(val data: String) : State90_51()
    data class Error(val message: String) : State90_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}