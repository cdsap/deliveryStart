package com.awesomeapp.notificationidentity

sealed class State166_129 {
    data object Loading : State166_129()
    data class Success(val data: String) : State166_129()
    data class Error(val message: String) : State166_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}