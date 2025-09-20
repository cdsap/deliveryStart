package com.awesomeapp.mapcontact

sealed class State87_88 {
    data object Loading : State87_88()
    data class Success(val data: String) : State87_88()
    data class Error(val message: String) : State87_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}