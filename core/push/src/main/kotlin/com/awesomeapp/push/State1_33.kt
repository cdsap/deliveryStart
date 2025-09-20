package com.awesomeapp.push

sealed class State1_33 {
    data object Loading : State1_33()
    data class Success(val data: String) : State1_33()
    data class Error(val message: String) : State1_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}