package com.awesomeapp.settinguser

sealed class State314_15 {
    data object Loading : State314_15()
    data class Success(val data: String) : State314_15()
    data class Error(val message: String) : State314_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}