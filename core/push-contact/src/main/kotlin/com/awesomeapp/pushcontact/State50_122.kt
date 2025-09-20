package com.awesomeapp.pushcontact

sealed class State50_122 {
    data object Loading : State50_122()
    data class Success(val data: String) : State50_122()
    data class Error(val message: String) : State50_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}