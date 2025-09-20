package com.awesomeapp.statuslocation

sealed class State614_102 {
    data object Loading : State614_102()
    data class Success(val data: String) : State614_102()
    data class Error(val message: String) : State614_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}