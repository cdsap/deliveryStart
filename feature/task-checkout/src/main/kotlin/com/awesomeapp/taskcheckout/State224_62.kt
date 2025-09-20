package com.awesomeapp.taskcheckout

sealed class State224_62 {
    data object Loading : State224_62()
    data class Success(val data: String) : State224_62()
    data class Error(val message: String) : State224_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}