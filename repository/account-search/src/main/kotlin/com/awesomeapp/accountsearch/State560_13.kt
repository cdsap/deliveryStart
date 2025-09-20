package com.awesomeapp.accountsearch

sealed class State560_13 {
    data object Loading : State560_13()
    data class Success(val data: String) : State560_13()
    data class Error(val message: String) : State560_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}