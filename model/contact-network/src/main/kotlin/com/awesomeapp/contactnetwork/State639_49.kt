package com.awesomeapp.contactnetwork

sealed class State639_49 {
    data object Loading : State639_49()
    data class Success(val data: String) : State639_49()
    data class Error(val message: String) : State639_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}