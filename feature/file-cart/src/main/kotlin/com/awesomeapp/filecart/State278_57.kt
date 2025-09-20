package com.awesomeapp.filecart

sealed class State278_57 {
    data object Loading : State278_57()
    data class Success(val data: String) : State278_57()
    data class Error(val message: String) : State278_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}