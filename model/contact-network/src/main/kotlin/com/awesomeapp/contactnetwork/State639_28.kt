package com.awesomeapp.contactnetwork

sealed class State639_28 {
    data object Loading : State639_28()
    data class Success(val data: String) : State639_28()
    data class Error(val message: String) : State639_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}