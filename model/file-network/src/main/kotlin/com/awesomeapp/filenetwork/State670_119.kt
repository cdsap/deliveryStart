package com.awesomeapp.filenetwork

sealed class State670_119 {
    data object Loading : State670_119()
    data class Success(val data: String) : State670_119()
    data class Error(val message: String) : State670_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}