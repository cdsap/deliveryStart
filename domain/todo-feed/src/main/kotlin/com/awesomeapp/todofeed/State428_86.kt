package com.awesomeapp.todofeed

sealed class State428_86 {
    data object Loading : State428_86()
    data class Success(val data: String) : State428_86()
    data class Error(val message: String) : State428_86()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}