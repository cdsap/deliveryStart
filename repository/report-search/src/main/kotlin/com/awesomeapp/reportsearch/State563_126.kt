package com.awesomeapp.reportsearch

sealed class State563_126 {
    data object Loading : State563_126()
    data class Success(val data: String) : State563_126()
    data class Error(val message: String) : State563_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}