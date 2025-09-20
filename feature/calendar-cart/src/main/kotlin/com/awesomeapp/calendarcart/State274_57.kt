package com.awesomeapp.calendarcart

sealed class State274_57 {
    data object Loading : State274_57()
    data class Success(val data: String) : State274_57()
    data class Error(val message: String) : State274_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}