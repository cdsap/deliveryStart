package com.awesomeapp.tasklocation

sealed class State616_38 {
    data object Loading : State616_38()
    data class Success(val data: String) : State616_38()
    data class Error(val message: String) : State616_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}