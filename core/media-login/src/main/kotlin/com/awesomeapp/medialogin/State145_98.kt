package com.awesomeapp.medialogin

sealed class State145_98 {
    data object Loading : State145_98()
    data class Success(val data: String) : State145_98()
    data class Error(val message: String) : State145_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}