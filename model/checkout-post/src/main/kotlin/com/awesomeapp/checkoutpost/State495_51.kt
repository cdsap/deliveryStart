package com.awesomeapp.checkoutpost

sealed class State495_51 {
    data object Loading : State495_51()
    data class Success(val data: String) : State495_51()
    data class Error(val message: String) : State495_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}