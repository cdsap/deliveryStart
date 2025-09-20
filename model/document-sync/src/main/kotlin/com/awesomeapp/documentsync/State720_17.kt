package com.awesomeapp.documentsync

sealed class State720_17 {
    data object Loading : State720_17()
    data class Success(val data: String) : State720_17()
    data class Error(val message: String) : State720_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}