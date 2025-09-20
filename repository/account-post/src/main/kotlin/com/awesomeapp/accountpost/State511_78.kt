package com.awesomeapp.accountpost

sealed class State511_78 {
    data object Loading : State511_78()
    data class Success(val data: String) : State511_78()
    data class Error(val message: String) : State511_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}