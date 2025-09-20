package com.awesomeapp.alarmcomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcomment.Viewmodel472_1
import com.awesomeapp.alarmcomment.Activity472_2
import com.awesomeapp.alarmcomment.Activity472_3
import com.awesomeapp.alarmcomment.Fragment472_4
import com.awesomeapp.alarmcomment.Repository472_5
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.alarmcomment.Api472_6
import com.awesomeapp.alarmcomment.Model472_8
import com.awesomeapp.alarmcomment.Model472_9
import com.awesomeapp.alarmcomment.Activity472_10
import com.awesomeapp.alarmcomment.Model472_12
import com.awesomeapp.alarmcomment.Activity472_13
import com.awesomeapp.alarmcomment.Model472_15
import com.awesomeapp.alarmcomment.Activity472_16

@Module
@InstallIn(SingletonComponent::class)
object Module_472 {
    @Provides
    @Singleton
    fun provideRepository472_5(
        api0: Api420_6 = Api420_6(),
        api1: Api336_6 = Api336_6(),
        api2: Api428_6 = Api428_6(),
        api3: Api440_6 = Api440_6(),
        api4: Api380_6 = Api380_6(),
        api5: Api408_6 = Api408_6(),
        api6: Api364_6 = Api364_6(),
        api7: Api404_6 = Api404_6(),
        api8: Api392_6 = Api392_6(),
        api9: Api360_6 = Api360_6(),
        api10: Api372_6 = Api372_6(),
        api11: Api344_6 = Api344_6(),
        api12: Api432_6 = Api432_6(),
        api13: Api348_6 = Api348_6(),
        api14: Api340_6 = Api340_6(),
        api15: Api412_6 = Api412_6(),
        api16: Api356_6 = Api356_6(),
        api17: Api368_6 = Api368_6()
    ): Repository472_5 {
        return Repository472_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12, 
        api13, 
        api14, 
        api15, 
        api16, 
        api17)
    }

    @Provides
    @Singleton
    fun provideApi472_6(): Api472_6 {
        return Api472_6()
    }
}