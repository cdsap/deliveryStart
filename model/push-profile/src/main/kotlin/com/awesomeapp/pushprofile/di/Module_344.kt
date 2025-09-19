package com.awesomeapp.pushprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.pushprofile.Viewmodel344_1
import com.awesomeapp.pushprofile.Activity344_2
import com.awesomeapp.pushprofile.Activity344_3
import com.awesomeapp.pushprofile.Fragment344_4
import com.awesomeapp.pushprofile.Repository344_5
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.pushprofile.Model344_8
import com.awesomeapp.pushprofile.Model344_9
import com.awesomeapp.pushprofile.Activity344_10
import com.awesomeapp.pushprofile.Model344_12
import com.awesomeapp.pushprofile.Activity344_13
import com.awesomeapp.pushprofile.Model344_15
import com.awesomeapp.pushprofile.Activity344_16
import com.awesomeapp.pushprofile.Model344_18
import com.awesomeapp.pushprofile.Activity344_19
import com.awesomeapp.pushprofile.Model344_21
import com.awesomeapp.pushprofile.Activity344_22

@Module
@InstallIn(SingletonComponent::class)
object Module_344 {
    @Provides
    @Singleton
    fun provideRepository344_5(
        api0: Api256_6 = Api256_6(),
        api1: Api268_6 = Api268_6(),
        api2: Api264_6 = Api264_6()
    ): Repository344_5 {
        return Repository344_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi344_6(): Api344_6 {
        return Api344_6()
    }
}