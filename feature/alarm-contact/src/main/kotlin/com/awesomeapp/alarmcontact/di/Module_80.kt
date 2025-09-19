package com.awesomeapp.alarmcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcontact.Viewmodel80_1
import com.awesomeapp.alarmcontact.Activity80_2
import com.awesomeapp.alarmcontact.Activity80_3
import com.awesomeapp.alarmcontact.Fragment80_4
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.alarmcontact.Service80_7
import com.awesomeapp.alarmcontact.Worker80_8
import com.awesomeapp.alarmcontact.Model80_10
import com.awesomeapp.alarmcontact.Model80_11
import com.awesomeapp.alarmcontact.Activity80_12
import com.awesomeapp.alarmcontact.Model80_14
import com.awesomeapp.alarmcontact.Activity80_15
import com.awesomeapp.alarmcontact.Model80_17
import com.awesomeapp.alarmcontact.Activity80_18
import com.awesomeapp.alarmcontact.Model80_20
import com.awesomeapp.alarmcontact.Activity80_21

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(
        api0: Api20_6 = Api20_6()
    ): Repository80_5 {
        return Repository80_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}