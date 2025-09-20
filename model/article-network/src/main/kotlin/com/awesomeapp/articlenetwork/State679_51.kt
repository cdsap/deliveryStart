package com.awesomeapp.articlenetwork

sealed class State679_51 {
    data object Loading : State679_51()
    data class Success(val data: String) : State679_51()
    data class Error(val message: String) : State679_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}