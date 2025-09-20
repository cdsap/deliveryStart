package com.awesomeapp.taskcomment

sealed class State469_87 {
    data object Loading : State469_87()
    data class Success(val data: String) : State469_87()
    data class Error(val message: String) : State469_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}