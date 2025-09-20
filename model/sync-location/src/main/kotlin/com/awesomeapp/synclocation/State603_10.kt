package com.awesomeapp.synclocation

sealed class State603_10 {
    data object Loading : State603_10()
    data class Success(val data: String) : State603_10()
    data class Error(val message: String) : State603_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}