package com.awesomeapp.searchsearch

sealed class State551_51 {
    data object Loading : State551_51()
    data class Success(val data: String) : State551_51()
    data class Error(val message: String) : State551_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}