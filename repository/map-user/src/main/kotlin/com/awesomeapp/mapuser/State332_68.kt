package com.awesomeapp.mapuser

sealed class State332_68 {
    data object Loading : State332_68()
    data class Success(val data: String) : State332_68()
    data class Error(val message: String) : State332_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}