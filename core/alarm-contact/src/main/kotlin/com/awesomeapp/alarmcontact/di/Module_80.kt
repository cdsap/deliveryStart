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
import com.awesomeapp.alarmcontact.Model80_23
import com.awesomeapp.alarmcontact.Activity80_24
import com.awesomeapp.alarmcontact.Model80_26
import com.awesomeapp.alarmcontact.Activity80_27
import com.awesomeapp.alarmcontact.Model80_29
import com.awesomeapp.alarmcontact.Activity80_30
import com.awesomeapp.alarmcontact.Model80_32
import com.awesomeapp.alarmcontact.Activity80_33
import com.awesomeapp.alarmcontact.Model80_35
import com.awesomeapp.alarmcontact.Activity80_36
import com.awesomeapp.alarmcontact.Model80_38
import com.awesomeapp.alarmcontact.Activity80_39
import com.awesomeapp.alarmcontact.Model80_41
import com.awesomeapp.alarmcontact.Activity80_42
import com.awesomeapp.alarmcontact.Model80_44
import com.awesomeapp.alarmcontact.Activity80_45
import com.awesomeapp.alarmcontact.Model80_47
import com.awesomeapp.alarmcontact.Activity80_48
import com.awesomeapp.alarmcontact.Model80_50
import com.awesomeapp.alarmcontact.Activity80_51
import com.awesomeapp.alarmcontact.Model80_53
import com.awesomeapp.alarmcontact.Activity80_54
import com.awesomeapp.alarmcontact.Model80_56
import com.awesomeapp.alarmcontact.Activity80_57
import com.awesomeapp.alarmcontact.Model80_59
import com.awesomeapp.alarmcontact.Activity80_60
import com.awesomeapp.alarmcontact.Model80_62
import com.awesomeapp.alarmcontact.Activity80_63
import com.awesomeapp.alarmcontact.Model80_65
import com.awesomeapp.alarmcontact.Activity80_66
import com.awesomeapp.alarmcontact.Model80_68
import com.awesomeapp.alarmcontact.Activity80_69
import com.awesomeapp.alarmcontact.Model80_71
import com.awesomeapp.alarmcontact.Activity80_72
import com.awesomeapp.alarmcontact.Model80_74
import com.awesomeapp.alarmcontact.Activity80_75
import com.awesomeapp.alarmcontact.Model80_77

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(): Repository80_5 {
        return Repository80_5()
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}