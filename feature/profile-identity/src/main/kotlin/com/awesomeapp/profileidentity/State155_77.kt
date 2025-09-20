package com.awesomeapp.profileidentity

sealed class State155_77 {
    data object Loading : State155_77()
    data class Success(val data: String) : State155_77()
    data class Error(val message: String) : State155_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}