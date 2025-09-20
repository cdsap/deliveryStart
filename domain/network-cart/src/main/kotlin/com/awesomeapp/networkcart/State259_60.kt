package com.awesomeapp.networkcart

sealed class State259_60 {
    data object Loading : State259_60()
    data class Success(val data: String) : State259_60()
    data class Error(val message: String) : State259_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}