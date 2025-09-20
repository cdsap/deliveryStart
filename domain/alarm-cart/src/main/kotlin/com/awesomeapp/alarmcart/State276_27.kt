package com.awesomeapp.alarmcart

sealed class State276_27 {
    data object Loading : State276_27()
    data class Success(val data: String) : State276_27()
    data class Error(val message: String) : State276_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}