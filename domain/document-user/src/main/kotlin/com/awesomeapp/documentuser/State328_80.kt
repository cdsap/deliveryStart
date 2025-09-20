package com.awesomeapp.documentuser

sealed class State328_80 {
    data object Loading : State328_80()
    data class Success(val data: String) : State328_80()
    data class Error(val message: String) : State328_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}