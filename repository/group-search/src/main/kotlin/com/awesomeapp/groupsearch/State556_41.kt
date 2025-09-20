package com.awesomeapp.groupsearch

sealed class State556_41 {
    data object Loading : State556_41()
    data class Success(val data: String) : State556_41()
    data class Error(val message: String) : State556_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}