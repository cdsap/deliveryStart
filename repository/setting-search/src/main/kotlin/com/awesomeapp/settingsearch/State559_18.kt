package com.awesomeapp.settingsearch

sealed class State559_18 {
    data object Loading : State559_18()
    data class Success(val data: String) : State559_18()
    data class Error(val message: String) : State559_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}