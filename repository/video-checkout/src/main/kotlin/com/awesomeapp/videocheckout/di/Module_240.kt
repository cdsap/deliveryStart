package com.awesomeapp.videocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.videocheckout.Viewmodel240_1
import com.awesomeapp.videocheckout.Activity240_2
import com.awesomeapp.videocheckout.Activity240_3
import com.awesomeapp.videocheckout.Fragment240_4
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.videocheckout.Service240_7
import com.awesomeapp.videocheckout.Worker240_8
import com.awesomeapp.videocheckout.Usecase240_9
import com.awesomeapp.videocheckout.Model240_11
import com.awesomeapp.videocheckout.Model240_12
import com.awesomeapp.videocheckout.Activity240_13
import com.awesomeapp.videocheckout.Model240_15
import com.awesomeapp.videocheckout.Activity240_16

@Module
@InstallIn(SingletonComponent::class)
object Module_240 {
    @Provides
    @Singleton
    fun provideRepository240_5(
        api0: Api184_6 = Api184_6(),
        api1: Api180_6 = Api180_6(),
        api2: Api148_6 = Api148_6(),
        api3: Api176_6 = Api176_6()
    ): Repository240_5 {
        return Repository240_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi240_6(): Api240_6 {
        return Api240_6()
    }
}