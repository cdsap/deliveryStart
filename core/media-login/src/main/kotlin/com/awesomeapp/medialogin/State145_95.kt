package com.awesomeapp.medialogin

sealed class State145_95 {
    data object Loading : State145_95()
    data class Success(val data: String) : State145_95()
    data class Error(val message: String) : State145_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}