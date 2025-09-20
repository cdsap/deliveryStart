package com.awesomeapp.settingcomment

sealed class State461_12 {
    data object Loading : State461_12()
    data class Success(val data: String) : State461_12()
    data class Error(val message: String) : State461_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}