package com.awesomeapp.maplocation

sealed class State626_54 {
    data object Loading : State626_54()
    data class Success(val data: String) : State626_54()
    data class Error(val message: String) : State626_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}