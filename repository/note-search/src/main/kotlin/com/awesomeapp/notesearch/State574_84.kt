package com.awesomeapp.notesearch

sealed class State574_84 {
    data object Loading : State574_84()
    data class Success(val data: String) : State574_84()
    data class Error(val message: String) : State574_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}