package com.awesomeapp.metriccart

sealed class State272_77 {
    data object Loading : State272_77()
    data class Success(val data: String) : State272_77()
    data class Error(val message: String) : State272_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}