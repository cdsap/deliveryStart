package com.awesomeapp.mapidentity

sealed class State185_74 {
    data object Loading : State185_74()
    data class Success(val data: String) : State185_74()
    data class Error(val message: String) : State185_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}