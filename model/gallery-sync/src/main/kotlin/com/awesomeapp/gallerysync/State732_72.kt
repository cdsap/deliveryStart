package com.awesomeapp.gallerysync

sealed class State732_72 {
    data object Loading : State732_72()
    data class Success(val data: String) : State732_72()
    data class Error(val message: String) : State732_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}