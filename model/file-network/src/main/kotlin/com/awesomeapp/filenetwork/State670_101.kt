package com.awesomeapp.filenetwork

sealed class State670_101 {
    data object Loading : State670_101()
    data class Success(val data: String) : State670_101()
    data class Error(val message: String) : State670_101()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}