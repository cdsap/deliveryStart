package com.awesomeapp.timerfeed

sealed class State424_17 {
    data object Loading : State424_17()
    data class Success(val data: String) : State424_17()
    data class Error(val message: String) : State424_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}