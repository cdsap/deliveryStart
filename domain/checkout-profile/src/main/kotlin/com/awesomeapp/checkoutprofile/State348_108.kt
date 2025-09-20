package com.awesomeapp.checkoutprofile

sealed class State348_108 {
    data object Loading : State348_108()
    data class Success(val data: String) : State348_108()
    data class Error(val message: String) : State348_108()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}