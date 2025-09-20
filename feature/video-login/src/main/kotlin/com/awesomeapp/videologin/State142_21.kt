package com.awesomeapp.videologin

sealed class State142_21 {
    data object Loading : State142_21()
    data class Success(val data: String) : State142_21()
    data class Error(val message: String) : State142_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}