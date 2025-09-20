package com.awesomeapp.newscart

sealed class State286_54 {
    data object Loading : State286_54()
    data class Success(val data: String) : State286_54()
    data class Error(val message: String) : State286_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}