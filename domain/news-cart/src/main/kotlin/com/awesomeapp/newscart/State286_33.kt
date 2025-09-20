package com.awesomeapp.newscart

sealed class State286_33 {
    data object Loading : State286_33()
    data class Success(val data: String) : State286_33()
    data class Error(val message: String) : State286_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}