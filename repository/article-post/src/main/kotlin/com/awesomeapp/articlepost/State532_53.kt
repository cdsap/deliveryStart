package com.awesomeapp.articlepost

sealed class State532_53 {
    data object Loading : State532_53()
    data class Success(val data: String) : State532_53()
    data class Error(val message: String) : State532_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}