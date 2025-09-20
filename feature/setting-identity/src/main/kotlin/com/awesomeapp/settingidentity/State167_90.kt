package com.awesomeapp.settingidentity

sealed class State167_90 {
    data object Loading : State167_90()
    data class Success(val data: String) : State167_90()
    data class Error(val message: String) : State167_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}