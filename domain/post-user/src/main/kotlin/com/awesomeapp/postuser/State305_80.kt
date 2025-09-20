package com.awesomeapp.postuser

sealed class State305_80 {
    data object Loading : State305_80()
    data class Success(val data: String) : State305_80()
    data class Error(val message: String) : State305_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}