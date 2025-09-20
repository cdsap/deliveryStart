package com.awesomeapp.settingcomment

sealed class State461_63 {
    data object Loading : State461_63()
    data class Success(val data: String) : State461_63()
    data class Error(val message: String) : State461_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}