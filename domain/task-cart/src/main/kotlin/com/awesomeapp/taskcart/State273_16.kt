package com.awesomeapp.taskcart

sealed class State273_16 {
    data object Loading : State273_16()
    data class Success(val data: String) : State273_16()
    data class Error(val message: String) : State273_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}