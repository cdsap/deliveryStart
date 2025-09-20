package com.awesomeapp.contactnetwork

sealed class State639_22 {
    data object Loading : State639_22()
    data class Success(val data: String) : State639_22()
    data class Error(val message: String) : State639_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}