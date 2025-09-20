package com.awesomeapp.fileuser

sealed class State327_22 {
    data object Loading : State327_22()
    data class Success(val data: String) : State327_22()
    data class Error(val message: String) : State327_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}