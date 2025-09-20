package com.awesomeapp.taskcomment

sealed class State469_81 {
    data object Loading : State469_81()
    data class Success(val data: String) : State469_81()
    data class Error(val message: String) : State469_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}