package com.awesomeapp.mapsync

sealed class State724_65 {
    data object Loading : State724_65()
    data class Success(val data: String) : State724_65()
    data class Error(val message: String) : State724_65()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}