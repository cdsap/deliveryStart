package com.awesomeapp.statuscontact

sealed class State75_51 {
    data object Loading : State75_51()
    data class Success(val data: String) : State75_51()
    data class Error(val message: String) : State75_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}