package com.awesomeapp.filecart

sealed class State278_78 {
    data object Loading : State278_78()
    data class Success(val data: String) : State278_78()
    data class Error(val message: String) : State278_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}