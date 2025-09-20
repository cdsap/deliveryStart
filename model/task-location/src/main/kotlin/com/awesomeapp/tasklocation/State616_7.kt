package com.awesomeapp.tasklocation

sealed class State616_7 {
    data object Loading : State616_7()
    data class Success(val data: String) : State616_7()
    data class Error(val message: String) : State616_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}