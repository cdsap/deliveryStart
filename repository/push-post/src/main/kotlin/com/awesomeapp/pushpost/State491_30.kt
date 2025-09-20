package com.awesomeapp.pushpost

sealed class State491_30 {
    data object Loading : State491_30()
    data class Success(val data: String) : State491_30()
    data class Error(val message: String) : State491_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}