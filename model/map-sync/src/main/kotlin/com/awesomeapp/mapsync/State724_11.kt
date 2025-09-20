package com.awesomeapp.mapsync

sealed class State724_11 {
    data object Loading : State724_11()
    data class Success(val data: String) : State724_11()
    data class Error(val message: String) : State724_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}