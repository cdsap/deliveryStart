package com.awesomeapp.filesearch

sealed class State572_83 {
    data object Loading : State572_83()
    data class Success(val data: String) : State572_83()
    data class Error(val message: String) : State572_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}