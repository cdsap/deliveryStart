package com.awesomeapp.pushcontact

sealed class State50_77 {
    data object Loading : State50_77()
    data class Success(val data: String) : State50_77()
    data class Error(val message: String) : State50_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}