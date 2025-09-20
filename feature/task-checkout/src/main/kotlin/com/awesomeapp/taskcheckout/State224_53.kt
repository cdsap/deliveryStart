package com.awesomeapp.taskcheckout

sealed class State224_53 {
    data object Loading : State224_53()
    data class Success(val data: String) : State224_53()
    data class Error(val message: String) : State224_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}