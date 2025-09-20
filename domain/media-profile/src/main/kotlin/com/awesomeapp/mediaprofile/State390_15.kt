package com.awesomeapp.mediaprofile

sealed class State390_15 {
    data object Loading : State390_15()
    data class Success(val data: String) : State390_15()
    data class Error(val message: String) : State390_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}