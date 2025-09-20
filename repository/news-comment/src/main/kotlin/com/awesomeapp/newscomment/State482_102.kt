package com.awesomeapp.newscomment

sealed class State482_102 {
    data object Loading : State482_102()
    data class Success(val data: String) : State482_102()
    data class Error(val message: String) : State482_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}