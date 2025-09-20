package com.awesomeapp.sharefeed

sealed class State408_57 {
    data object Loading : State408_57()
    data class Success(val data: String) : State408_57()
    data class Error(val message: String) : State408_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}