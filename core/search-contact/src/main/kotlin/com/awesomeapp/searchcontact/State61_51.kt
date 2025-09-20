package com.awesomeapp.searchcontact

sealed class State61_51 {
    data object Loading : State61_51()
    data class Success(val data: String) : State61_51()
    data class Error(val message: String) : State61_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}