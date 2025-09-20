package com.awesomeapp.todocontact

sealed class State85_71 {
    data object Loading : State85_71()
    data class Success(val data: String) : State85_71()
    data class Error(val message: String) : State85_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}