package com.awesomeapp.sessionlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionlogin.Viewmodel120_1
import com.awesomeapp.sessionlogin.Activity120_2
import com.awesomeapp.sessionlogin.Activity120_3
import com.awesomeapp.sessionlogin.Fragment120_4
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.video.Api44_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.sessionlogin.Service120_7
import com.awesomeapp.sessionlogin.Worker120_8
import com.awesomeapp.sessionlogin.Usecase120_9
import com.awesomeapp.sessionlogin.Model120_11
import com.awesomeapp.sessionlogin.Model120_12
import com.awesomeapp.sessionlogin.Activity120_13
import com.awesomeapp.sessionlogin.Model120_15
import com.awesomeapp.sessionlogin.Activity120_16
import com.awesomeapp.sessionlogin.Model120_18
import com.awesomeapp.sessionlogin.Activity120_19
import com.awesomeapp.sessionlogin.Model120_21
import com.awesomeapp.sessionlogin.Activity120_22
import com.awesomeapp.sessionlogin.Model120_24
import com.awesomeapp.sessionlogin.Activity120_25
import com.awesomeapp.sessionlogin.Model120_27
import com.awesomeapp.sessionlogin.Activity120_28
import com.awesomeapp.sessionlogin.Model120_30

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api44_6 = Api44_6()
    ): Repository120_5 {
        return Repository120_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}