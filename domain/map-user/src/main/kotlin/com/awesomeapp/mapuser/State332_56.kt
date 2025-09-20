package com.awesomeapp.mapuser

sealed class State332_56 {
    data object Loading : State332_56()
    data class Success(val data: String) : State332_56()
    data class Error(val message: String) : State332_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}