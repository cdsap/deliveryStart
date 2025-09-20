package com.awesomeapp.settingnetwork

sealed class State657_19 {
    data object Loading : State657_19()
    data class Success(val data: String) : State657_19()
    data class Error(val message: String) : State657_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}