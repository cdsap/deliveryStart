package com.awesomeapp.postshare

sealed class State746_90 {
    data object Loading : State746_90()
    data class Success(val data: String) : State746_90()
    data class Error(val message: String) : State746_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}