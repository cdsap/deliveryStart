package com.awesomeapp.syncsearch

sealed class State554_30 {
    data object Loading : State554_30()
    data class Success(val data: String) : State554_30()
    data class Error(val message: String) : State554_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}