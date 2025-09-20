package com.awesomeapp.profile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.profile.Viewmodel8_1
import com.awesomeapp.profile.Activity8_2
import com.awesomeapp.profile.Activity8_3
import com.awesomeapp.profile.Fragment8_4
import com.awesomeapp.profile.Repository8_5
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.profile.Model8_8
import com.awesomeapp.profile.Model8_9
import com.awesomeapp.profile.Activity8_10
import com.awesomeapp.profile.Model8_12
import com.awesomeapp.profile.Activity8_13
import com.awesomeapp.profile.Model8_15
import com.awesomeapp.profile.Activity8_16
import com.awesomeapp.profile.Model8_18
import com.awesomeapp.profile.Activity8_19
import com.awesomeapp.profile.Model8_21
import com.awesomeapp.profile.Activity8_22
import com.awesomeapp.profile.Model8_24
import com.awesomeapp.profile.Activity8_25
import com.awesomeapp.profile.Model8_27
import com.awesomeapp.profile.Activity8_28
import com.awesomeapp.profile.Model8_30
import com.awesomeapp.profile.Activity8_31
import com.awesomeapp.profile.Model8_33
import com.awesomeapp.profile.Activity8_34
import com.awesomeapp.profile.Model8_36
import com.awesomeapp.profile.Activity8_37
import com.awesomeapp.profile.Model8_39
import com.awesomeapp.profile.Activity8_40
import com.awesomeapp.profile.Model8_42
import com.awesomeapp.profile.Activity8_43
import com.awesomeapp.profile.Model8_45
import com.awesomeapp.profile.Activity8_46
import com.awesomeapp.profile.Model8_48
import com.awesomeapp.profile.Activity8_49
import com.awesomeapp.profile.Model8_51

@Module
@InstallIn(SingletonComponent::class)
object Module_8 {
    @Provides
    @Singleton
    fun provideRepository8_5(): Repository8_5 {
        return Repository8_5()
    }

    @Provides
    @Singleton
    fun provideApi8_6(): Api8_6 {
        return Api8_6()
    }
}