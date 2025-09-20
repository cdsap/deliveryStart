package com.awesomeapp.searchuser

sealed class State306_22 {
    data object Loading : State306_22()
    data class Success(val data: String) : State306_22()
    data class Error(val message: String) : State306_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}