package com.awesomeapp.networklocation

sealed class State602_27 {
    data object Loading : State602_27()
    data class Success(val data: String) : State602_27()
    data class Error(val message: String) : State602_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}