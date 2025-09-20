package com.awesomeapp.locationshare.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationshare.Viewmodel748_1
import com.awesomeapp.locationshare.Activity748_2
import com.awesomeapp.locationshare.Activity748_3
import com.awesomeapp.locationshare.Fragment748_4
import com.awesomeapp.locationshare.Repository748_5
import com.awesomeapp.notecomment.Api476_6
import com.awesomeapp.articlepost.Api532_6
import com.awesomeapp.weathercomment.Api480_6
import com.awesomeapp.searchlocation.Api600_6
import com.awesomeapp.podcastcomment.Api484_6
import com.awesomeapp.postcomment.Api452_6
import com.awesomeapp.messagepost.Api508_6
import com.awesomeapp.documentpost.Api524_6
import com.awesomeapp.gallerypost.Api536_6
import com.awesomeapp.synccomment.Api456_6
import com.awesomeapp.metriccomment.Api468_6
import com.awesomeapp.cartpost.Api496_6
import com.awesomeapp.pushsearch.Api540_6
import com.awesomeapp.analyticscomment.Api464_6
import com.awesomeapp.photosearch.Api584_6
import com.awesomeapp.checkoutsearch.Api544_6
import com.awesomeapp.accountsearch.Api560_6
import com.awesomeapp.playlistsearch.Api588_6
import com.awesomeapp.locationsearch.Api552_6
import com.awesomeapp.groupsearch.Api556_6
import com.awesomeapp.calendarsearch.Api568_6
import com.awesomeapp.logsearch.Api564_6
import com.awesomeapp.locationshare.Api748_6
import com.awesomeapp.locationshare.Model748_8
import com.awesomeapp.locationshare.Model748_9
import com.awesomeapp.locationshare.Activity748_10
import com.awesomeapp.locationshare.Model748_12
import com.awesomeapp.locationshare.Activity748_13
import com.awesomeapp.locationshare.Model748_15
import com.awesomeapp.locationshare.Activity748_16
import com.awesomeapp.locationshare.Model748_18
import com.awesomeapp.locationshare.Activity748_19
import com.awesomeapp.locationshare.Model748_21
import com.awesomeapp.locationshare.Activity748_22
import com.awesomeapp.locationshare.Model748_24
import com.awesomeapp.locationshare.Activity748_25
import com.awesomeapp.locationshare.Model748_27
import com.awesomeapp.locationshare.Activity748_28
import com.awesomeapp.locationshare.Model748_30
import com.awesomeapp.locationshare.Activity748_31
import com.awesomeapp.locationshare.Model748_33
import com.awesomeapp.locationshare.Activity748_34
import com.awesomeapp.locationshare.Model748_36
import com.awesomeapp.locationshare.Activity748_37
import com.awesomeapp.locationshare.Model748_39
import com.awesomeapp.locationshare.Activity748_40

@Module
@InstallIn(SingletonComponent::class)
object Module_748 {
    @Provides
    @Singleton
    fun provideRepository748_5(
        api0: Api476_6 = Api476_6(),
        api1: Api532_6 = Api532_6(),
        api2: Api480_6 = Api480_6(),
        api3: Api600_6 = Api600_6(),
        api4: Api484_6 = Api484_6(),
        api5: Api452_6 = Api452_6(),
        api6: Api508_6 = Api508_6(),
        api7: Api524_6 = Api524_6(),
        api8: Api536_6 = Api536_6(),
        api9: Api456_6 = Api456_6(),
        api10: Api468_6 = Api468_6(),
        api11: Api496_6 = Api496_6(),
        api12: Api540_6 = Api540_6(),
        api13: Api464_6 = Api464_6(),
        api14: Api584_6 = Api584_6(),
        api15: Api544_6 = Api544_6(),
        api16: Api560_6 = Api560_6(),
        api17: Api588_6 = Api588_6(),
        api18: Api552_6 = Api552_6(),
        api19: Api556_6 = Api556_6(),
        api20: Api568_6 = Api568_6(),
        api21: Api564_6 = Api564_6()
    ): Repository748_5 {
        return Repository748_5(api0, 
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
        api20, 
        api21)
    }

    @Provides
    @Singleton
    fun provideApi748_6(): Api748_6 {
        return Api748_6()
    }
}