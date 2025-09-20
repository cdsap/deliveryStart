package com.awesomeapp.logcart

sealed class State270_69 {
    data object Loading : State270_69()
    data class Success(val data: String) : State270_69()
    data class Error(val message: String) : State270_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}