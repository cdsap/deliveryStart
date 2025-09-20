package com.awesomeapp.accountsearch

sealed class State560_67 {
    data object Loading : State560_67()
    data class Success(val data: String) : State560_67()
    data class Error(val message: String) : State560_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}