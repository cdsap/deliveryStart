package com.awesomeapp.videologin

sealed class State142_27 {
    data object Loading : State142_27()
    data class Success(val data: String) : State142_27()
    data class Error(val message: String) : State142_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}