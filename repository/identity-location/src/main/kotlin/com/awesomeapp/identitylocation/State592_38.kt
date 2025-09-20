package com.awesomeapp.identitylocation

sealed class State592_38 {
    data object Loading : State592_38()
    data class Success(val data: String) : State592_38()
    data class Error(val message: String) : State592_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}