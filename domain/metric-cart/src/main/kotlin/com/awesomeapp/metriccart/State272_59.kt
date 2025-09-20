package com.awesomeapp.metriccart

sealed class State272_59 {
    data object Loading : State272_59()
    data class Success(val data: String) : State272_59()
    data class Error(val message: String) : State272_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}