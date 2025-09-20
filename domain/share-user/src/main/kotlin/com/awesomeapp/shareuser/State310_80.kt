package com.awesomeapp.shareuser

sealed class State310_80 {
    data object Loading : State310_80()
    data class Success(val data: String) : State310_80()
    data class Error(val message: String) : State310_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}