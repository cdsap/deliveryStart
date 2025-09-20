package com.awesomeapp.identitylocation

sealed class State592_77 {
    data object Loading : State592_77()
    data class Success(val data: String) : State592_77()
    data class Error(val message: String) : State592_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}