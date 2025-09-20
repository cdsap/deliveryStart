package com.awesomeapp.list

sealed class State37_51 {
    data object Loading : State37_51()
    data class Success(val data: String) : State37_51()
    data class Error(val message: String) : State37_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}