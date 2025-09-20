package com.awesomeapp.logsearch

sealed class State564_78 {
    data object Loading : State564_78()
    data class Success(val data: String) : State564_78()
    data class Error(val message: String) : State564_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}