package com.awesomeapp.taskidentity

sealed class State175_38 {
    data object Loading : State175_38()
    data class Success(val data: String) : State175_38()
    data class Error(val message: String) : State175_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}