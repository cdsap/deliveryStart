package com.awesomeapp.groupprofile

sealed class State360_17 {
    data object Loading : State360_17()
    data class Success(val data: String) : State360_17()
    data class Error(val message: String) : State360_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}