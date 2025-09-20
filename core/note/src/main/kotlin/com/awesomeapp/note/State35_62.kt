package com.awesomeapp.note

sealed class State35_62 {
    data object Loading : State35_62()
    data class Success(val data: String) : State35_62()
    data class Error(val message: String) : State35_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}