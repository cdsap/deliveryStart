package com.awesomeapp.documentidentity

sealed class State181_126 {
    data object Loading : State181_126()
    data class Success(val data: String) : State181_126()
    data class Error(val message: String) : State181_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}