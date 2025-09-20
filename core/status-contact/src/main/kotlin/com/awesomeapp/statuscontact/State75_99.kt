package com.awesomeapp.statuscontact

sealed class State75_99 {
    data object Loading : State75_99()
    data class Success(val data: String) : State75_99()
    data class Error(val message: String) : State75_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}