package com.awesomeapp.networkcart

sealed class State259_33 {
    data object Loading : State259_33()
    data class Success(val data: String) : State259_33()
    data class Error(val message: String) : State259_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}