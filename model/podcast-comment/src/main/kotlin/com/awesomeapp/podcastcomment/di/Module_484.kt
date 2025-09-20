package com.awesomeapp.podcastcomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcomment.Viewmodel484_1
import com.awesomeapp.podcastcomment.Activity484_2
import com.awesomeapp.podcastcomment.Activity484_3
import com.awesomeapp.podcastcomment.Fragment484_4
import com.awesomeapp.podcastcomment.Repository484_5
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.podcastcomment.Api484_6
import com.awesomeapp.podcastcomment.Model484_8
import com.awesomeapp.podcastcomment.Model484_9
import com.awesomeapp.podcastcomment.Activity484_10
import com.awesomeapp.podcastcomment.Model484_12
import com.awesomeapp.podcastcomment.Activity484_13
import com.awesomeapp.podcastcomment.Model484_15
import com.awesomeapp.podcastcomment.Activity484_16
import com.awesomeapp.podcastcomment.Model484_18
import com.awesomeapp.podcastcomment.Activity484_19
import com.awesomeapp.podcastcomment.Model484_21
import com.awesomeapp.podcastcomment.Activity484_22
import com.awesomeapp.podcastcomment.Model484_24
import com.awesomeapp.podcastcomment.Activity484_25
import com.awesomeapp.podcastcomment.Model484_27
import com.awesomeapp.podcastcomment.Activity484_28

@Module
@InstallIn(SingletonComponent::class)
object Module_484 {
    @Provides
    @Singleton
    fun provideRepository484_5(
        api0: Api352_6 = Api352_6(),
        api1: Api396_6 = Api396_6(),
        api2: Api380_6 = Api380_6(),
        api3: Api428_6 = Api428_6(),
        api4: Api368_6 = Api368_6(),
        api5: Api336_6 = Api336_6()
    ): Repository484_5 {
        return Repository484_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi484_6(): Api484_6 {
        return Api484_6()
    }
}