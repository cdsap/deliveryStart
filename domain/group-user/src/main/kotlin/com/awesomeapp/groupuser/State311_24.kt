package com.awesomeapp.groupuser

sealed class State311_24 {
    data object Loading : State311_24()
    data class Success(val data: String) : State311_24()
    data class Error(val message: String) : State311_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}