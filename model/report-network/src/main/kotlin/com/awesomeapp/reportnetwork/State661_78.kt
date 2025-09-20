package com.awesomeapp.reportnetwork

sealed class State661_78 {
    data object Loading : State661_78()
    data class Success(val data: String) : State661_78()
    data class Error(val message: String) : State661_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}