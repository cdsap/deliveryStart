package com.awesomeapp.sharefeed

sealed class State408_126 {
    data object Loading : State408_126()
    data class Success(val data: String) : State408_126()
    data class Error(val message: String) : State408_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}