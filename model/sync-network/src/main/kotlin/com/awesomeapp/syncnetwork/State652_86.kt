package com.awesomeapp.syncnetwork

sealed class State652_86 {
    data object Loading : State652_86()
    data class Success(val data: String) : State652_86()
    data class Error(val message: String) : State652_86()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}