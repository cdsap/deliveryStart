package com.awesomeapp.article

sealed class State42_55 {
    data object Loading : State42_55()
    data class Success(val data: String) : State42_55()
    data class Error(val message: String) : State42_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}