package com.awesomeapp.sharenetwork

sealed class State653_60 {
    data object Loading : State653_60()
    data class Success(val data: String) : State653_60()
    data class Error(val message: String) : State653_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}