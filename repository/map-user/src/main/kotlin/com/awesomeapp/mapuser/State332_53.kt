package com.awesomeapp.mapuser

sealed class State332_53 {
    data object Loading : State332_53()
    data class Success(val data: String) : State332_53()
    data class Error(val message: String) : State332_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}