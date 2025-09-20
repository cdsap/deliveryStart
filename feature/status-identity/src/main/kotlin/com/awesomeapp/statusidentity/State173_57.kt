package com.awesomeapp.statusidentity

sealed class State173_57 {
    data object Loading : State173_57()
    data class Success(val data: String) : State173_57()
    data class Error(val message: String) : State173_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}