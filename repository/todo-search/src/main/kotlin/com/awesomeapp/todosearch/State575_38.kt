package com.awesomeapp.todosearch

sealed class State575_38 {
    data object Loading : State575_38()
    data class Success(val data: String) : State575_38()
    data class Error(val message: String) : State575_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}