package com.awesomeapp.timerfeed

sealed class State424_68 {
    data object Loading : State424_68()
    data class Success(val data: String) : State424_68()
    data class Error(val message: String) : State424_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}