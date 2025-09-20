package com.awesomeapp.alarmsync

sealed class State717_22 {
    data object Loading : State717_22()
    data class Success(val data: String) : State717_22()
    data class Error(val message: String) : State717_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}