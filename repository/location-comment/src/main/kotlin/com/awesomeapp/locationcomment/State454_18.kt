package com.awesomeapp.locationcomment

sealed class State454_18 {
    data object Loading : State454_18()
    data class Success(val data: String) : State454_18()
    data class Error(val message: String) : State454_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}