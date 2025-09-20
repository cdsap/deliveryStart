package com.awesomeapp.documentsearch

sealed class State573_10 {
    data object Loading : State573_10()
    data class Success(val data: String) : State573_10()
    data class Error(val message: String) : State573_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}