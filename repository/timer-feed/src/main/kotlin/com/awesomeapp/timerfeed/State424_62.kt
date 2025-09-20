package com.awesomeapp.timerfeed

sealed class State424_62 {
    data object Loading : State424_62()
    data class Success(val data: String) : State424_62()
    data class Error(val message: String) : State424_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}