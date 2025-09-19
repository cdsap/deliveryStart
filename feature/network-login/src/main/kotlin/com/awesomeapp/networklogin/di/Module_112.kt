package com.awesomeapp.networklogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networklogin.Viewmodel112_1
import com.awesomeapp.networklogin.Activity112_2
import com.awesomeapp.networklogin.Activity112_3
import com.awesomeapp.networklogin.Fragment112_4
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.networklogin.Model112_8
import com.awesomeapp.networklogin.Model112_9
import com.awesomeapp.networklogin.Activity112_10
import com.awesomeapp.networklogin.Model112_12
import com.awesomeapp.networklogin.Activity112_13
import com.awesomeapp.networklogin.Model112_15

@Module
@InstallIn(SingletonComponent::class)
object Module_112 {
    @Provides
    @Singleton
    fun provideRepository112_5(
        api0: Api60_6 = Api60_6(),
        api1: Api28_6 = Api28_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api52_6 = Api52_6(),
        api4: Api68_6 = Api68_6()
    ): Repository112_5 {
        return Repository112_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi112_6(): Api112_6 {
        return Api112_6()
    }
}