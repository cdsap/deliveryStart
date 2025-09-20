package com.awesomeapp.listcheckout

sealed class State233_54 {
    data object Loading : State233_54()
    data class Success(val data: String) : State233_54()
    data class Error(val message: String) : State233_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}