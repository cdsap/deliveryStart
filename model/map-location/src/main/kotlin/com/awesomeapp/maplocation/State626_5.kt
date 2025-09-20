package com.awesomeapp.maplocation

sealed class State626_5 {
    data object Loading : State626_5()
    data class Success(val data: String) : State626_5()
    data class Error(val message: String) : State626_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}