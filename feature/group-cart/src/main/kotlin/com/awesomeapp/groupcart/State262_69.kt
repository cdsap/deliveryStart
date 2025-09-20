package com.awesomeapp.groupcart

sealed class State262_69 {
    data object Loading : State262_69()
    data class Success(val data: String) : State262_69()
    data class Error(val message: String) : State262_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}