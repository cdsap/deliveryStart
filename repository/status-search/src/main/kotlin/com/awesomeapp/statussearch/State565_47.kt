package com.awesomeapp.statussearch

sealed class State565_47 {
    data object Loading : State565_47()
    data class Success(val data: String) : State565_47()
    data class Error(val message: String) : State565_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}