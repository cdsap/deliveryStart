package com.awesomeapp.logsearch

sealed class State564_117 {
    data object Loading : State564_117()
    data class Success(val data: String) : State564_117()
    data class Error(val message: String) : State564_117()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}