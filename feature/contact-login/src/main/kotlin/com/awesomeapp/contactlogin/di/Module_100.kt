package com.awesomeapp.contactlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactlogin.Viewmodel100_1
import com.awesomeapp.contactlogin.Activity100_2
import com.awesomeapp.contactlogin.Activity100_3
import com.awesomeapp.contactlogin.Fragment100_4
import com.awesomeapp.contactlogin.Repository100_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.contactlogin.Service100_7
import com.awesomeapp.contactlogin.Worker100_8
import com.awesomeapp.contactlogin.Model100_10
import com.awesomeapp.contactlogin.Model100_11
import com.awesomeapp.contactlogin.Activity100_12
import com.awesomeapp.contactlogin.Model100_14
import com.awesomeapp.contactlogin.Activity100_15
import com.awesomeapp.contactlogin.Model100_17
import com.awesomeapp.contactlogin.Activity100_18
import com.awesomeapp.contactlogin.Model100_20
import com.awesomeapp.contactlogin.Activity100_21

@Module
@InstallIn(SingletonComponent::class)
object Module_100 {
    @Provides
    @Singleton
    fun provideRepository100_5(
        api0: Api36_6 = Api36_6(),
        api1: Api48_6 = Api48_6(),
        api2: Api16_6 = Api16_6(),
        api3: Api12_6 = Api12_6(),
        api4: Api24_6 = Api24_6(),
        api5: Api40_6 = Api40_6(),
        api6: Api44_6 = Api44_6()
    ): Repository100_5 {
        return Repository100_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi100_6(): Api100_6 {
        return Api100_6()
    }
}