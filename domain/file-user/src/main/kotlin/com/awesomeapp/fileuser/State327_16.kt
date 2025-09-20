package com.awesomeapp.fileuser

sealed class State327_16 {
    data object Loading : State327_16()
    data class Success(val data: String) : State327_16()
    data class Error(val message: String) : State327_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}