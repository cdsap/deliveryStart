package com.awesomeapp.listsearch

sealed class State576_8 {
    data object Loading : State576_8()
    data class Success(val data: String) : State576_8()
    data class Error(val message: String) : State576_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}