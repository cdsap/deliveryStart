package com.awesomeapp.groupsearch

sealed class State556_77 {
    data object Loading : State556_77()
    data class Success(val data: String) : State556_77()
    data class Error(val message: String) : State556_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}