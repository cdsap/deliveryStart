package com.awesomeapp.settingpost

sealed class State510_18 {
    data object Loading : State510_18()
    data class Success(val data: String) : State510_18()
    data class Error(val message: String) : State510_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}