package com.awesomeapp.reportcontact

sealed class State73_90 {
    data object Loading : State73_90()
    data class Success(val data: String) : State73_90()
    data class Error(val message: String) : State73_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}