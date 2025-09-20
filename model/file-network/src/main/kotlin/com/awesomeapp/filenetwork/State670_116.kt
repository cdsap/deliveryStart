package com.awesomeapp.filenetwork

sealed class State670_116 {
    data object Loading : State670_116()
    data class Success(val data: String) : State670_116()
    data class Error(val message: String) : State670_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}