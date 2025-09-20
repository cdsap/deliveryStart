package com.awesomeapp.photoprofile

sealed class State388_44 {
    data object Loading : State388_44()
    data class Success(val data: String) : State388_44()
    data class Error(val message: String) : State388_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}