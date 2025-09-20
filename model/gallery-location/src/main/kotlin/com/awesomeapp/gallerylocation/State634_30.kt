package com.awesomeapp.gallerylocation

sealed class State634_30 {
    data object Loading : State634_30()
    data class Success(val data: String) : State634_30()
    data class Error(val message: String) : State634_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}