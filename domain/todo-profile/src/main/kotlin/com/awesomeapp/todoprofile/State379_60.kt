package com.awesomeapp.todoprofile

sealed class State379_60 {
    data object Loading : State379_60()
    data class Success(val data: String) : State379_60()
    data class Error(val message: String) : State379_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}