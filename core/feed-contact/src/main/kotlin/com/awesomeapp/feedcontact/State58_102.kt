package com.awesomeapp.feedcontact

sealed class State58_102 {
    data object Loading : State58_102()
    data class Success(val data: String) : State58_102()
    data class Error(val message: String) : State58_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}