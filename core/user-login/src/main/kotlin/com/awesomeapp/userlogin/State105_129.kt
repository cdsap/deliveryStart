package com.awesomeapp.userlogin

sealed class State105_129 {
    data object Loading : State105_129()
    data class Success(val data: String) : State105_129()
    data class Error(val message: String) : State105_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}