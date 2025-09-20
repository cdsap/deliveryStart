package com.awesomeapp.todosearch

sealed class State575_104 {
    data object Loading : State575_104()
    data class Success(val data: String) : State575_104()
    data class Error(val message: String) : State575_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}