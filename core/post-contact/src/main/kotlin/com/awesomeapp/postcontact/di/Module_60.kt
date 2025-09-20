package com.awesomeapp.postcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcontact.Viewmodel60_1
import com.awesomeapp.postcontact.Activity60_2
import com.awesomeapp.postcontact.Activity60_3
import com.awesomeapp.postcontact.Fragment60_4
import com.awesomeapp.postcontact.Repository60_5
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.postcontact.Service60_7
import com.awesomeapp.postcontact.Worker60_8
import com.awesomeapp.postcontact.Usecase60_9
import com.awesomeapp.postcontact.Model60_11
import com.awesomeapp.postcontact.Model60_12
import com.awesomeapp.postcontact.Activity60_13
import com.awesomeapp.postcontact.Model60_15
import com.awesomeapp.postcontact.Activity60_16
import com.awesomeapp.postcontact.Model60_18
import com.awesomeapp.postcontact.Activity60_19
import com.awesomeapp.postcontact.Model60_21
import com.awesomeapp.postcontact.Activity60_22
import com.awesomeapp.postcontact.Model60_24
import com.awesomeapp.postcontact.Activity60_25
import com.awesomeapp.postcontact.Model60_27
import com.awesomeapp.postcontact.Activity60_28
import com.awesomeapp.postcontact.Model60_30
import com.awesomeapp.postcontact.Activity60_31
import com.awesomeapp.postcontact.Model60_33
import com.awesomeapp.postcontact.Activity60_34
import com.awesomeapp.postcontact.Model60_36
import com.awesomeapp.postcontact.Activity60_37
import com.awesomeapp.postcontact.Model60_39
import com.awesomeapp.postcontact.Activity60_40
import com.awesomeapp.postcontact.Model60_42
import com.awesomeapp.postcontact.Activity60_43
import com.awesomeapp.postcontact.Model60_45
import com.awesomeapp.postcontact.Activity60_46
import com.awesomeapp.postcontact.Model60_48
import com.awesomeapp.postcontact.Activity60_49
import com.awesomeapp.postcontact.Model60_51
import com.awesomeapp.postcontact.Activity60_52

@Module
@InstallIn(SingletonComponent::class)
object Module_60 {
    @Provides
    @Singleton
    fun provideRepository60_5(): Repository60_5 {
        return Repository60_5()
    }

    @Provides
    @Singleton
    fun provideApi60_6(): Api60_6 {
        return Api60_6()
    }
}