package com.awesomeapp.articlelocation

sealed class State630_51 {
    data object Loading : State630_51()
    data class Success(val data: String) : State630_51()
    data class Error(val message: String) : State630_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}