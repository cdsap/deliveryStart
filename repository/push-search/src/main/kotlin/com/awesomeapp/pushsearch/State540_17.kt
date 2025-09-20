package com.awesomeapp.pushsearch

sealed class State540_17 {
    data object Loading : State540_17()
    data class Success(val data: String) : State540_17()
    data class Error(val message: String) : State540_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}