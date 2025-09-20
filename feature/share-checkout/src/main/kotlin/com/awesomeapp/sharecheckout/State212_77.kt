package com.awesomeapp.sharecheckout

sealed class State212_77 {
    data object Loading : State212_77()
    data class Success(val data: String) : State212_77()
    data class Error(val message: String) : State212_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}