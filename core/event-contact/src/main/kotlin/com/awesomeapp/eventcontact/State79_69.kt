package com.awesomeapp.eventcontact

sealed class State79_69 {
    data object Loading : State79_69()
    data class Success(val data: String) : State79_69()
    data class Error(val message: String) : State79_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}