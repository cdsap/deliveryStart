package com.awesomeapp.newsnetwork

sealed class State678_94 {
    data object Loading : State678_94()
    data class Success(val data: String) : State678_94()
    data class Error(val message: String) : State678_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}