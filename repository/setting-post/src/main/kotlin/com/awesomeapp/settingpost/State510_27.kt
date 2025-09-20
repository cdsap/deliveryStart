package com.awesomeapp.settingpost

sealed class State510_27 {
    data object Loading : State510_27()
    data class Success(val data: String) : State510_27()
    data class Error(val message: String) : State510_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}