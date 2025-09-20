package com.awesomeapp.contactcomment

sealed class State443_18 {
    data object Loading : State443_18()
    data class Success(val data: String) : State443_18()
    data class Error(val message: String) : State443_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}