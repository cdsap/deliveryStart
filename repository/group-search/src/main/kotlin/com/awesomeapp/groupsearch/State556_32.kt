package com.awesomeapp.groupsearch

sealed class State556_32 {
    data object Loading : State556_32()
    data class Success(val data: String) : State556_32()
    data class Error(val message: String) : State556_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}