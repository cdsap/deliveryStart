package com.awesomeapp.notecontact

sealed class State84_33 {
    data object Loading : State84_33()
    data class Success(val data: String) : State84_33()
    data class Error(val message: String) : State84_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}