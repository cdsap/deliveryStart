package com.awesomeapp.identitylocation

sealed class State592_101 {
    data object Loading : State592_101()
    data class Success(val data: String) : State592_101()
    data class Error(val message: String) : State592_101()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}