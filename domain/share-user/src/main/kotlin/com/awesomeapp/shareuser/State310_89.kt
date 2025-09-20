package com.awesomeapp.shareuser

sealed class State310_89 {
    data object Loading : State310_89()
    data class Success(val data: String) : State310_89()
    data class Error(val message: String) : State310_89()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}