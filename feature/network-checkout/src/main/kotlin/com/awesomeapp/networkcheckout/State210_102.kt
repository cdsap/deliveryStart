package com.awesomeapp.networkcheckout

sealed class State210_102 {
    data object Loading : State210_102()
    data class Success(val data: String) : State210_102()
    data class Error(val message: String) : State210_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}