package com.awesomeapp.fileidentity

sealed class State180_38 {
    data object Loading : State180_38()
    data class Success(val data: String) : State180_38()
    data class Error(val message: String) : State180_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}