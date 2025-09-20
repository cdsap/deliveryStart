package com.awesomeapp.alarmlogin

sealed class State129_34 {
    data object Loading : State129_34()
    data class Success(val data: String) : State129_34()
    data class Error(val message: String) : State129_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}