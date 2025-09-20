package com.awesomeapp.analyticspost

sealed class State513_94 {
    data object Loading : State513_94()
    data class Success(val data: String) : State513_94()
    data class Error(val message: String) : State513_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}