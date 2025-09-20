package com.awesomeapp.checkoutpost

sealed class State495_27 {
    data object Loading : State495_27()
    data class Success(val data: String) : State495_27()
    data class Error(val message: String) : State495_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}