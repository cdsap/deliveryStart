package com.awesomeapp.alarmcontact

sealed class State80_67 {
    data object Loading : State80_67()
    data class Success(val data: String) : State80_67()
    data class Error(val message: String) : State80_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}