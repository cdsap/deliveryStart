package com.awesomeapp.reportlogin

sealed class State122_138 {
    data object Loading : State122_138()
    data class Success(val data: String) : State122_138()
    data class Error(val message: String) : State122_138()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}