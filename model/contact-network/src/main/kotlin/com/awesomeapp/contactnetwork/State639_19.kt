package com.awesomeapp.contactnetwork

sealed class State639_19 {
    data object Loading : State639_19()
    data class Success(val data: String) : State639_19()
    data class Error(val message: String) : State639_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}