package com.awesomeapp.documentidentity

sealed class State181_39 {
    data object Loading : State181_39()
    data class Success(val data: String) : State181_39()
    data class Error(val message: String) : State181_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}