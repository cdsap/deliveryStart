package com.awesomeapp.photoprofile

sealed class State388_14 {
    data object Loading : State388_14()
    data class Success(val data: String) : State388_14()
    data class Error(val message: String) : State388_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}