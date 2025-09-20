package com.awesomeapp.groupuser

sealed class State311_36 {
    data object Loading : State311_36()
    data class Success(val data: String) : State311_36()
    data class Error(val message: String) : State311_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}