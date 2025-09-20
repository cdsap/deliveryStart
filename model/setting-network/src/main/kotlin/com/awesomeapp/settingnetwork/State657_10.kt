package com.awesomeapp.settingnetwork

sealed class State657_10 {
    data object Loading : State657_10()
    data class Success(val data: String) : State657_10()
    data class Error(val message: String) : State657_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}