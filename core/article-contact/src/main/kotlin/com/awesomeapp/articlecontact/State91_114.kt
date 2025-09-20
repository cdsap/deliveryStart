package com.awesomeapp.articlecontact

sealed class State91_114 {
    data object Loading : State91_114()
    data class Success(val data: String) : State91_114()
    data class Error(val message: String) : State91_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}