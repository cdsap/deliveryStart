package com.awesomeapp.documentuser

sealed class State328_59 {
    data object Loading : State328_59()
    data class Success(val data: String) : State328_59()
    data class Error(val message: String) : State328_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}