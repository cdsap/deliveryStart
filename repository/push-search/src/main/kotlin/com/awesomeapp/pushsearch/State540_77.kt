package com.awesomeapp.pushsearch

sealed class State540_77 {
    data object Loading : State540_77()
    data class Success(val data: String) : State540_77()
    data class Error(val message: String) : State540_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}