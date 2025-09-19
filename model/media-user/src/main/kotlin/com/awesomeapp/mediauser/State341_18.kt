package com.awesomeapp.mediauser

sealed class State341_18 {
    data object Loading : State341_18()
    data class Success(val data: String) : State341_18()
    data class Error(val message: String) : State341_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}