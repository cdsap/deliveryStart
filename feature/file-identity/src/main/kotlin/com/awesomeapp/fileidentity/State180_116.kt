package com.awesomeapp.fileidentity

sealed class State180_116 {
    data object Loading : State180_116()
    data class Success(val data: String) : State180_116()
    data class Error(val message: String) : State180_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}