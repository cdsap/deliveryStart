package com.awesomeapp.documentcheckout

sealed class State230_89 {
    data object Loading : State230_89()
    data class Success(val data: String) : State230_89()
    data class Error(val message: String) : State230_89()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}