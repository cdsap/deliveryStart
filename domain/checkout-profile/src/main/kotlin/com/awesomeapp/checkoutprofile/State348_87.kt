package com.awesomeapp.checkoutprofile

sealed class State348_87 {
    data object Loading : State348_87()
    data class Success(val data: String) : State348_87()
    data class Error(val message: String) : State348_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}