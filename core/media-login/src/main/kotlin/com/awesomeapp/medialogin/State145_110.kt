package com.awesomeapp.medialogin

sealed class State145_110 {
    data object Loading : State145_110()
    data class Success(val data: String) : State145_110()
    data class Error(val message: String) : State145_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}