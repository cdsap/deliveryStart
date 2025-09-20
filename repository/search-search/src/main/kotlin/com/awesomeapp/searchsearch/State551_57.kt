package com.awesomeapp.searchsearch

sealed class State551_57 {
    data object Loading : State551_57()
    data class Success(val data: String) : State551_57()
    data class Error(val message: String) : State551_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}