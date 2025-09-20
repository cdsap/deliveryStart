package com.awesomeapp.loguser

sealed class State319_69 {
    data object Loading : State319_69()
    data class Success(val data: String) : State319_69()
    data class Error(val message: String) : State319_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}