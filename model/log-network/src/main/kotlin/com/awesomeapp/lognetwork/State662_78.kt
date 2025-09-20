package com.awesomeapp.lognetwork

sealed class State662_78 {
    data object Loading : State662_78()
    data class Success(val data: String) : State662_78()
    data class Error(val message: String) : State662_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}