package com.awesomeapp.documentuser

sealed class State328_38 {
    data object Loading : State328_38()
    data class Success(val data: String) : State328_38()
    data class Error(val message: String) : State328_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}