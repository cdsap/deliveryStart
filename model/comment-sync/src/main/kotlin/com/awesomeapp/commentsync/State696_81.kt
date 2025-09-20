package com.awesomeapp.commentsync

sealed class State696_81 {
    data object Loading : State696_81()
    data class Success(val data: String) : State696_81()
    data class Error(val message: String) : State696_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}