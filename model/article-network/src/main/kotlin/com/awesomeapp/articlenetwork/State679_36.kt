package com.awesomeapp.articlenetwork

sealed class State679_36 {
    data object Loading : State679_36()
    data class Success(val data: String) : State679_36()
    data class Error(val message: String) : State679_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}