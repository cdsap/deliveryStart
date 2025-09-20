package com.awesomeapp.articlecart

sealed class State287_54 {
    data object Loading : State287_54()
    data class Success(val data: String) : State287_54()
    data class Error(val message: String) : State287_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}