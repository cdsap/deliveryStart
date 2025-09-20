package com.awesomeapp.document

sealed class State34_45 {
    data object Loading : State34_45()
    data class Success(val data: String) : State34_45()
    data class Error(val message: String) : State34_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}