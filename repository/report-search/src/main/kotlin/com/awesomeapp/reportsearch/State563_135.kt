package com.awesomeapp.reportsearch

sealed class State563_135 {
    data object Loading : State563_135()
    data class Success(val data: String) : State563_135()
    data class Error(val message: String) : State563_135()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}