package com.awesomeapp.commentsync

sealed class State696_39 {
    data object Loading : State696_39()
    data class Success(val data: String) : State696_39()
    data class Error(val message: String) : State696_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}