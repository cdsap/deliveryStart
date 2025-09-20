package com.awesomeapp.filecheckout

sealed class State229_48 {
    data object Loading : State229_48()
    data class Success(val data: String) : State229_48()
    data class Error(val message: String) : State229_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}