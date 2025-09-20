package com.awesomeapp.networkuser

sealed class State308_68 {
    data object Loading : State308_68()
    data class Success(val data: String) : State308_68()
    data class Error(val message: String) : State308_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}