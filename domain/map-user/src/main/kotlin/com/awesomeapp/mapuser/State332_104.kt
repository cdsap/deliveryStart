package com.awesomeapp.mapuser

sealed class State332_104 {
    data object Loading : State332_104()
    data class Success(val data: String) : State332_104()
    data class Error(val message: String) : State332_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}