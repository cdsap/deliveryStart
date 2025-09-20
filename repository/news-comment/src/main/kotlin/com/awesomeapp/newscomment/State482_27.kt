package com.awesomeapp.newscomment

sealed class State482_27 {
    data object Loading : State482_27()
    data class Success(val data: String) : State482_27()
    data class Error(val message: String) : State482_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}