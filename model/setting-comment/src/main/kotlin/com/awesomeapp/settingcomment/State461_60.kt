package com.awesomeapp.settingcomment

sealed class State461_60 {
    data object Loading : State461_60()
    data class Success(val data: String) : State461_60()
    data class Error(val message: String) : State461_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}