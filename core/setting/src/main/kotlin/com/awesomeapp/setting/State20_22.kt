package com.awesomeapp.setting

sealed class State20_22 {
    data object Loading : State20_22()
    data class Success(val data: String) : State20_22()
    data class Error(val message: String) : State20_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}