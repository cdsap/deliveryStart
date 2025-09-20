package com.awesomeapp.postidentity

sealed class State158_135 {
    data object Loading : State158_135()
    data class Success(val data: String) : State158_135()
    data class Error(val message: String) : State158_135()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}