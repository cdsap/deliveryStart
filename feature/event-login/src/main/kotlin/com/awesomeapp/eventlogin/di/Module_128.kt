package com.awesomeapp.eventlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventlogin.Viewmodel128_1
import com.awesomeapp.eventlogin.Activity128_2
import com.awesomeapp.eventlogin.Activity128_3
import com.awesomeapp.eventlogin.Fragment128_4
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.eventlogin.Model128_8
import com.awesomeapp.eventlogin.Model128_9
import com.awesomeapp.eventlogin.Activity128_10
import com.awesomeapp.eventlogin.Model128_12
import com.awesomeapp.eventlogin.Activity128_13
import com.awesomeapp.eventlogin.Model128_15
import com.awesomeapp.eventlogin.Activity128_16
import com.awesomeapp.eventlogin.Model128_18
import com.awesomeapp.eventlogin.Activity128_19

@Module
@InstallIn(SingletonComponent::class)
object Module_128 {
    @Provides
    @Singleton
    fun provideRepository128_5(
        api0: Api48_6 = Api48_6(),
        api1: Api8_6 = Api8_6(),
        api2: Api44_6 = Api44_6(),
        api3: Api64_6 = Api64_6(),
        api4: Api68_6 = Api68_6(),
        api5: Api56_6 = Api56_6(),
        api6: Api32_6 = Api32_6(),
        api7: Api40_6 = Api40_6()
    ): Repository128_5 {
        return Repository128_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi128_6(): Api128_6 {
        return Api128_6()
    }
}