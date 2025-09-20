package com.awesomeapp.feedsearch.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.feedsearch.Viewmodel548_1
import com.awesomeapp.feedsearch.Activity548_2
import com.awesomeapp.feedsearch.Activity548_3
import com.awesomeapp.feedsearch.Fragment548_4
import com.awesomeapp.feedsearch.Repository548_5
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.timerfeed.Api424_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.reportfeed.Api416_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.usercomment.Api448_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.feedsearch.Api548_6
import com.awesomeapp.feedsearch.Model548_8
import com.awesomeapp.feedsearch.Model548_9
import com.awesomeapp.feedsearch.Activity548_10
import com.awesomeapp.feedsearch.Model548_12
import com.awesomeapp.feedsearch.Activity548_13
import com.awesomeapp.feedsearch.Model548_15
import com.awesomeapp.feedsearch.Activity548_16
import com.awesomeapp.feedsearch.Model548_18
import com.awesomeapp.feedsearch.Activity548_19

@Module
@InstallIn(SingletonComponent::class)
object Module_548 {
    @Provides
    @Singleton
    fun provideRepository548_5(
        api0: Api332_6 = Api332_6(),
        api1: Api372_6 = Api372_6(),
        api2: Api324_6 = Api324_6(),
        api3: Api344_6 = Api344_6(),
        api4: Api432_6 = Api432_6(),
        api5: Api404_6 = Api404_6(),
        api6: Api392_6 = Api392_6(),
        api7: Api316_6 = Api316_6(),
        api8: Api424_6 = Api424_6(),
        api9: Api420_6 = Api420_6(),
        api10: Api380_6 = Api380_6(),
        api11: Api416_6 = Api416_6(),
        api12: Api312_6 = Api312_6(),
        api13: Api340_6 = Api340_6(),
        api14: Api396_6 = Api396_6(),
        api15: Api448_6 = Api448_6(),
        api16: Api328_6 = Api328_6(),
        api17: Api308_6 = Api308_6(),
        api18: Api320_6 = Api320_6(),
        api19: Api384_6 = Api384_6(),
        api20: Api348_6 = Api348_6()
    ): Repository548_5 {
        return Repository548_5(api0, 
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
        api17, 
        api18, 
        api19, 
        api20)
    }

    @Provides
    @Singleton
    fun provideApi548_6(): Api548_6 {
        return Api548_6()
    }
}