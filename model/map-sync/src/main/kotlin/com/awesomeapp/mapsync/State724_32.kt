package com.awesomeapp.mapsync

sealed class State724_32 {
    data object Loading : State724_32()
    data class Success(val data: String) : State724_32()
    data class Error(val message: String) : State724_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}