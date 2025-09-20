package com.awesomeapp.filenetwork

sealed class State670_98 {
    data object Loading : State670_98()
    data class Success(val data: String) : State670_98()
    data class Error(val message: String) : State670_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}