package com.awesomeapp.logincontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logincontact.Viewmodel52_1
import com.awesomeapp.logincontact.Activity52_2
import com.awesomeapp.logincontact.Activity52_3
import com.awesomeapp.logincontact.Fragment52_4
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.logincontact.Model52_8
import com.awesomeapp.logincontact.Model52_9
import com.awesomeapp.logincontact.Activity52_10
import com.awesomeapp.logincontact.Model52_12
import com.awesomeapp.logincontact.Activity52_13
import com.awesomeapp.logincontact.Model52_15
import com.awesomeapp.logincontact.Activity52_16
import com.awesomeapp.logincontact.Model52_18
import com.awesomeapp.logincontact.Activity52_19
import com.awesomeapp.logincontact.Model52_21
import com.awesomeapp.logincontact.Activity52_22
import com.awesomeapp.logincontact.Model52_24
import com.awesomeapp.logincontact.Activity52_25
import com.awesomeapp.logincontact.Model52_27
import com.awesomeapp.logincontact.Activity52_28
import com.awesomeapp.logincontact.Model52_30
import com.awesomeapp.logincontact.Activity52_31
import com.awesomeapp.logincontact.Model52_33
import com.awesomeapp.logincontact.Activity52_34
import com.awesomeapp.logincontact.Model52_36
import com.awesomeapp.logincontact.Activity52_37
import com.awesomeapp.logincontact.Model52_39
import com.awesomeapp.logincontact.Activity52_40
import com.awesomeapp.logincontact.Model52_42
import com.awesomeapp.logincontact.Activity52_43
import com.awesomeapp.logincontact.Model52_45
import com.awesomeapp.logincontact.Activity52_46
import com.awesomeapp.logincontact.Model52_48
import com.awesomeapp.logincontact.Activity52_49
import com.awesomeapp.logincontact.Model52_51
import com.awesomeapp.logincontact.Activity52_52
import com.awesomeapp.logincontact.Model52_54
import com.awesomeapp.logincontact.Activity52_55
import com.awesomeapp.logincontact.Model52_57
import com.awesomeapp.logincontact.Activity52_58

@Module
@InstallIn(SingletonComponent::class)
object Module_52 {
    @Provides
    @Singleton
    fun provideRepository52_5(): Repository52_5 {
        return Repository52_5()
    }

    @Provides
    @Singleton
    fun provideApi52_6(): Api52_6 {
        return Api52_6()
    }
}