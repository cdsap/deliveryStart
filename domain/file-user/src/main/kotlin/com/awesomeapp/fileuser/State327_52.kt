package com.awesomeapp.fileuser

sealed class State327_52 {
    data object Loading : State327_52()
    data class Success(val data: String) : State327_52()
    data class Error(val message: String) : State327_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}