package com.awesomeapp.logcart

sealed class State270_27 {
    data object Loading : State270_27()
    data class Success(val data: String) : State270_27()
    data class Error(val message: String) : State270_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}