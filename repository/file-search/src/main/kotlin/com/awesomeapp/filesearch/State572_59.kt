package com.awesomeapp.filesearch

sealed class State572_59 {
    data object Loading : State572_59()
    data class Success(val data: String) : State572_59()
    data class Error(val message: String) : State572_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}