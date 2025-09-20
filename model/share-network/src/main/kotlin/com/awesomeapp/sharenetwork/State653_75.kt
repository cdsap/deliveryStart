package com.awesomeapp.sharenetwork

sealed class State653_75 {
    data object Loading : State653_75()
    data class Success(val data: String) : State653_75()
    data class Error(val message: String) : State653_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}