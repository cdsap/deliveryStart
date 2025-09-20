package com.awesomeapp.profilesync

sealed class State694_66 {
    data object Loading : State694_66()
    data class Success(val data: String) : State694_66()
    data class Error(val message: String) : State694_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}