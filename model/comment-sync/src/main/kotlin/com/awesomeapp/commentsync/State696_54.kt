package com.awesomeapp.commentsync

sealed class State696_54 {
    data object Loading : State696_54()
    data class Success(val data: String) : State696_54()
    data class Error(val message: String) : State696_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}