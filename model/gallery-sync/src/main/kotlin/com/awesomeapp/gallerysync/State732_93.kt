package com.awesomeapp.gallerysync

sealed class State732_93 {
    data object Loading : State732_93()
    data class Success(val data: String) : State732_93()
    data class Error(val message: String) : State732_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}