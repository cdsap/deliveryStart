package com.awesomeapp.listlogin

sealed class State135_102 {
    data object Loading : State135_102()
    data class Success(val data: String) : State135_102()
    data class Error(val message: String) : State135_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}