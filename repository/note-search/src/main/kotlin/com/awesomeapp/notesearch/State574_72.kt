package com.awesomeapp.notesearch

sealed class State574_72 {
    data object Loading : State574_72()
    data class Success(val data: String) : State574_72()
    data class Error(val message: String) : State574_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}