package com.awesomeapp.usercontact

sealed class State56_14 {
    data object Loading : State56_14()
    data class Success(val data: String) : State56_14()
    data class Error(val message: String) : State56_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}