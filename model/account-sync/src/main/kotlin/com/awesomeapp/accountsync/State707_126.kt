package com.awesomeapp.accountsync

sealed class State707_126 {
    data object Loading : State707_126()
    data class Success(val data: String) : State707_126()
    data class Error(val message: String) : State707_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}