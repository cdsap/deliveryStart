package com.awesomeapp.gallerylocation

sealed class State634_27 {
    data object Loading : State634_27()
    data class Success(val data: String) : State634_27()
    data class Error(val message: String) : State634_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}