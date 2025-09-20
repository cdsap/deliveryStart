package com.awesomeapp.groupcomment

sealed class State458_60 {
    data object Loading : State458_60()
    data class Success(val data: String) : State458_60()
    data class Error(val message: String) : State458_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}