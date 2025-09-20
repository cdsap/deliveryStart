package com.awesomeapp.synclocation

sealed class State603_13 {
    data object Loading : State603_13()
    data class Success(val data: String) : State603_13()
    data class Error(val message: String) : State603_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}