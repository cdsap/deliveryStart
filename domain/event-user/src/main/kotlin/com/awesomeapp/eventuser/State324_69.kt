package com.awesomeapp.eventuser

sealed class State324_69 {
    data object Loading : State324_69()
    data class Success(val data: String) : State324_69()
    data class Error(val message: String) : State324_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}