package com.awesomeapp.groupcomment

sealed class State458_78 {
    data object Loading : State458_78()
    data class Success(val data: String) : State458_78()
    data class Error(val message: String) : State458_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}