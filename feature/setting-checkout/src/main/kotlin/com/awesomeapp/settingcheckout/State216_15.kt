package com.awesomeapp.settingcheckout

sealed class State216_15 {
    data object Loading : State216_15()
    data class Success(val data: String) : State216_15()
    data class Error(val message: String) : State216_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}