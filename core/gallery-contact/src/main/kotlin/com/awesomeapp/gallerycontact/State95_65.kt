package com.awesomeapp.gallerycontact

sealed class State95_65 {
    data object Loading : State95_65()
    data class Success(val data: String) : State95_65()
    data class Error(val message: String) : State95_65()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}