package com.awesomeapp.photopost

sealed class State535_50 {
    data object Loading : State535_50()
    data class Success(val data: String) : State535_50()
    data class Error(val message: String) : State535_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}