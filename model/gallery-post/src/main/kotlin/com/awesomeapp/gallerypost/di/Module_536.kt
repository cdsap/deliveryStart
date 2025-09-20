package com.awesomeapp.gallerypost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.gallerypost.Viewmodel536_1
import com.awesomeapp.gallerypost.Activity536_2
import com.awesomeapp.gallerypost.Activity536_3
import com.awesomeapp.gallerypost.Fragment536_4
import com.awesomeapp.gallerypost.Repository536_5
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.gallerypost.Api536_6
import com.awesomeapp.gallerypost.Model536_8
import com.awesomeapp.gallerypost.Model536_9
import com.awesomeapp.gallerypost.Activity536_10
import com.awesomeapp.gallerypost.Model536_12
import com.awesomeapp.gallerypost.Activity536_13
import com.awesomeapp.gallerypost.Model536_15
import com.awesomeapp.gallerypost.Activity536_16

@Module
@InstallIn(SingletonComponent::class)
object Module_536 {
    @Provides
    @Singleton
    fun provideRepository536_5(
        api0: Api384_6 = Api384_6(),
        api1: Api380_6 = Api380_6(),
        api2: Api404_6 = Api404_6(),
        api3: Api428_6 = Api428_6(),
        api4: Api352_6 = Api352_6(),
        api5: Api392_6 = Api392_6(),
        api6: Api364_6 = Api364_6(),
        api7: Api360_6 = Api360_6(),
        api8: Api420_6 = Api420_6()
    ): Repository536_5 {
        return Repository536_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi536_6(): Api536_6 {
        return Api536_6()
    }
}