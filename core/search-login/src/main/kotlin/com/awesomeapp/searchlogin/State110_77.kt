package com.awesomeapp.searchlogin

sealed class State110_77 {
    data object Loading : State110_77()
    data class Success(val data: String) : State110_77()
    data class Error(val message: String) : State110_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}