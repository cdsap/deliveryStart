package com.awesomeapp.notesearch

sealed class State574_21 {
    data object Loading : State574_21()
    data class Success(val data: String) : State574_21()
    data class Error(val message: String) : State574_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}