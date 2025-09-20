package com.awesomeapp.audiopost

sealed class State538_15 {
    data object Loading : State538_15()
    data class Success(val data: String) : State538_15()
    data class Error(val message: String) : State538_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}