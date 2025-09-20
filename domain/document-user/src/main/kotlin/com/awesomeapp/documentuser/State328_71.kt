package com.awesomeapp.documentuser

sealed class State328_71 {
    data object Loading : State328_71()
    data class Success(val data: String) : State328_71()
    data class Error(val message: String) : State328_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}