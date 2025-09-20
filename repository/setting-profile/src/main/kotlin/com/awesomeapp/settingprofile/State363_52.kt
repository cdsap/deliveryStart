package com.awesomeapp.settingprofile

sealed class State363_52 {
    data object Loading : State363_52()
    data class Success(val data: String) : State363_52()
    data class Error(val message: String) : State363_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}