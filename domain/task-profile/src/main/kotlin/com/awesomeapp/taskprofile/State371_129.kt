package com.awesomeapp.taskprofile

sealed class State371_129 {
    data object Loading : State371_129()
    data class Success(val data: String) : State371_129()
    data class Error(val message: String) : State371_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}