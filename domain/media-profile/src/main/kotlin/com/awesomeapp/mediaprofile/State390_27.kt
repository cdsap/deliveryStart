package com.awesomeapp.mediaprofile

sealed class State390_27 {
    data object Loading : State390_27()
    data class Success(val data: String) : State390_27()
    data class Error(val message: String) : State390_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}