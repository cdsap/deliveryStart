package com.awesomeapp.audioprofile

sealed class State391_102 {
    data object Loading : State391_102()
    data class Success(val data: String) : State391_102()
    data class Error(val message: String) : State391_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}