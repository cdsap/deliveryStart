package com.awesomeapp.logcheckout

sealed class State221_51 {
    data object Loading : State221_51()
    data class Success(val data: String) : State221_51()
    data class Error(val message: String) : State221_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}