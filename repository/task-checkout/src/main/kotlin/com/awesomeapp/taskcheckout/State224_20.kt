package com.awesomeapp.taskcheckout

sealed class State224_20 {
    data object Loading : State224_20()
    data class Success(val data: String) : State224_20()
    data class Error(val message: String) : State224_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}