package com.awesomeapp.settingprofile

sealed class State363_49 {
    data object Loading : State363_49()
    data class Success(val data: String) : State363_49()
    data class Error(val message: String) : State363_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}