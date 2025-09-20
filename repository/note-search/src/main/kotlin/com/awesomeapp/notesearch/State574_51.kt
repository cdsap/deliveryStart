package com.awesomeapp.notesearch

sealed class State574_51 {
    data object Loading : State574_51()
    data class Success(val data: String) : State574_51()
    data class Error(val message: String) : State574_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}