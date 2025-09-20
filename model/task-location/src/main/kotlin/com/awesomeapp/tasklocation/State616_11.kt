package com.awesomeapp.tasklocation

sealed class State616_11 {
    data object Loading : State616_11()
    data class Success(val data: String) : State616_11()
    data class Error(val message: String) : State616_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}