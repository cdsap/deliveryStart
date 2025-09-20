package com.awesomeapp.pushsearch

sealed class State540_62 {
    data object Loading : State540_62()
    data class Success(val data: String) : State540_62()
    data class Error(val message: String) : State540_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}