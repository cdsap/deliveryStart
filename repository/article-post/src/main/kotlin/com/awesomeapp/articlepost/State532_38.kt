package com.awesomeapp.articlepost

sealed class State532_38 {
    data object Loading : State532_38()
    data class Success(val data: String) : State532_38()
    data class Error(val message: String) : State532_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}