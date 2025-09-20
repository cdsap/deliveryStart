package com.awesomeapp.medialocation

sealed class State635_74 {
    data object Loading : State635_74()
    data class Success(val data: String) : State635_74()
    data class Error(val message: String) : State635_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}