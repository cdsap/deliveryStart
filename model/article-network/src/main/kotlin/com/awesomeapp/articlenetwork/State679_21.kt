package com.awesomeapp.articlenetwork

sealed class State679_21 {
    data object Loading : State679_21()
    data class Success(val data: String) : State679_21()
    data class Error(val message: String) : State679_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}