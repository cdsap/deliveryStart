package com.awesomeapp.pushcomment

sealed class State442_129 {
    data object Loading : State442_129()
    data class Success(val data: String) : State442_129()
    data class Error(val message: String) : State442_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}