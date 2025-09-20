package com.awesomeapp.profilecontact

sealed class State57_61 {
    data object Loading : State57_61()
    data class Success(val data: String) : State57_61()
    data class Error(val message: String) : State57_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}