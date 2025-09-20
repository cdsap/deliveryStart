package com.awesomeapp.settingidentity

sealed class State167_21 {
    data object Loading : State167_21()
    data class Success(val data: String) : State167_21()
    data class Error(val message: String) : State167_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}