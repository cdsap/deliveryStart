package com.awesomeapp.networkcart

sealed class State259_21 {
    data object Loading : State259_21()
    data class Success(val data: String) : State259_21()
    data class Error(val message: String) : State259_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}