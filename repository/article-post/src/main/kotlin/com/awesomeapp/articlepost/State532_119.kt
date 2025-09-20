package com.awesomeapp.articlepost

sealed class State532_119 {
    data object Loading : State532_119()
    data class Success(val data: String) : State532_119()
    data class Error(val message: String) : State532_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}