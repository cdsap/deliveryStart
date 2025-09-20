package com.awesomeapp.eventuser

sealed class State324_72 {
    data object Loading : State324_72()
    data class Success(val data: String) : State324_72()
    data class Error(val message: String) : State324_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}