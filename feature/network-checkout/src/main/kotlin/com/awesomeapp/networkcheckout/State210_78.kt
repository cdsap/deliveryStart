package com.awesomeapp.networkcheckout

sealed class State210_78 {
    data object Loading : State210_78()
    data class Success(val data: String) : State210_78()
    data class Error(val message: String) : State210_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}