package com.awesomeapp.noteidentity

sealed class State182_51 {
    data object Loading : State182_51()
    data class Success(val data: String) : State182_51()
    data class Error(val message: String) : State182_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}