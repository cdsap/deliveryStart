package com.awesomeapp.settinguser

sealed class State314_72 {
    data object Loading : State314_72()
    data class Success(val data: String) : State314_72()
    data class Error(val message: String) : State314_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}