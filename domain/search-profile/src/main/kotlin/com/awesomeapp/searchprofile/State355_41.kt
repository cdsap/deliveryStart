package com.awesomeapp.searchprofile

sealed class State355_41 {
    data object Loading : State355_41()
    data class Success(val data: String) : State355_41()
    data class Error(val message: String) : State355_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}