package com.awesomeapp.reportlocation

sealed class State612_15 {
    data object Loading : State612_15()
    data class Success(val data: String) : State612_15()
    data class Error(val message: String) : State612_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}