package com.awesomeapp.lognetwork

sealed class State662_18 {
    data object Loading : State662_18()
    data class Success(val data: String) : State662_18()
    data class Error(val message: String) : State662_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}