package com.awesomeapp.tasklocation

sealed class State616_89 {
    data object Loading : State616_89()
    data class Success(val data: String) : State616_89()
    data class Error(val message: String) : State616_89()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}