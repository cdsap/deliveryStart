package com.awesomeapp.reportcart

sealed class State269_69 {
    data object Loading : State269_69()
    data class Success(val data: String) : State269_69()
    data class Error(val message: String) : State269_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}