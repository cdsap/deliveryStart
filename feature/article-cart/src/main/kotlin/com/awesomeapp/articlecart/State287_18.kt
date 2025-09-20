package com.awesomeapp.articlecart

sealed class State287_18 {
    data object Loading : State287_18()
    data class Success(val data: String) : State287_18()
    data class Error(val message: String) : State287_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}