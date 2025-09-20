package com.awesomeapp.settingidentity

sealed class State167_81 {
    data object Loading : State167_81()
    data class Success(val data: String) : State167_81()
    data class Error(val message: String) : State167_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}