package com.awesomeapp.documentcheckout

sealed class State230_104 {
    data object Loading : State230_104()
    data class Success(val data: String) : State230_104()
    data class Error(val message: String) : State230_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}