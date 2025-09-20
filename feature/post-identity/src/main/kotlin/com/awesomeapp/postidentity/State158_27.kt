package com.awesomeapp.postidentity

sealed class State158_27 {
    data object Loading : State158_27()
    data class Success(val data: String) : State158_27()
    data class Error(val message: String) : State158_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}