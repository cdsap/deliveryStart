package com.awesomeapp.forecastcontact

sealed class State89_45 {
    data object Loading : State89_45()
    data class Success(val data: String) : State89_45()
    data class Error(val message: String) : State89_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}