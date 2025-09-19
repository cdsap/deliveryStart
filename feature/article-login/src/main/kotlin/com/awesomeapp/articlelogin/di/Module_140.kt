package com.awesomeapp.articlelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articlelogin.Viewmodel140_1
import com.awesomeapp.articlelogin.Activity140_2
import com.awesomeapp.articlelogin.Activity140_3
import com.awesomeapp.articlelogin.Fragment140_4
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.task.Api28_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.articlelogin.Service140_7
import com.awesomeapp.articlelogin.Worker140_8
import com.awesomeapp.articlelogin.Model140_10
import com.awesomeapp.articlelogin.Model140_11
import com.awesomeapp.articlelogin.Activity140_12
import com.awesomeapp.articlelogin.Model140_14
import com.awesomeapp.articlelogin.Activity140_15
import com.awesomeapp.articlelogin.Model140_17
import com.awesomeapp.articlelogin.Activity140_18
import com.awesomeapp.articlelogin.Model140_20
import com.awesomeapp.articlelogin.Activity140_21

@Module
@InstallIn(SingletonComponent::class)
object Module_140 {
    @Provides
    @Singleton
    fun provideRepository140_5(
        api0: Api28_6 = Api28_6(),
        api1: Api68_6 = Api68_6(),
        api2: Api60_6 = Api60_6(),
        api3: Api24_6 = Api24_6(),
        api4: Api40_6 = Api40_6(),
        api5: Api20_6 = Api20_6(),
        api6: Api64_6 = Api64_6(),
        api7: Api48_6 = Api48_6(),
        api8: Api4_6 = Api4_6(),
        api9: Api44_6 = Api44_6()
    ): Repository140_5 {
        return Repository140_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi140_6(): Api140_6 {
        return Api140_6()
    }
}