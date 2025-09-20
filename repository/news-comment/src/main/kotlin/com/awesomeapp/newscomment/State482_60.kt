package com.awesomeapp.newscomment

sealed class State482_60 {
    data object Loading : State482_60()
    data class Success(val data: String) : State482_60()
    data class Error(val message: String) : State482_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}