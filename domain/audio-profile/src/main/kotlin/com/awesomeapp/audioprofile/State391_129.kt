package com.awesomeapp.audioprofile

sealed class State391_129 {
    data object Loading : State391_129()
    data class Success(val data: String) : State391_129()
    data class Error(val message: String) : State391_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}