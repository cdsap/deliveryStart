package com.awesomeapp.networkpost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networkpost.Viewmodel504_1
import com.awesomeapp.networkpost.Activity504_2
import com.awesomeapp.networkpost.Activity504_3
import com.awesomeapp.networkpost.Fragment504_4
import com.awesomeapp.networkpost.Repository504_5
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.logincomment.Api444_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.networkpost.Api504_6
import com.awesomeapp.networkpost.Usecase504_7
import com.awesomeapp.networkpost.Model504_9
import com.awesomeapp.networkpost.Model504_10
import com.awesomeapp.networkpost.Activity504_11
import com.awesomeapp.networkpost.Model504_13
import com.awesomeapp.networkpost.Activity504_14
import com.awesomeapp.networkpost.Model504_16
import com.awesomeapp.networkpost.Activity504_17
import com.awesomeapp.networkpost.Model504_19

@Module
@InstallIn(SingletonComponent::class)
object Module_504 {
    @Provides
    @Singleton
    fun provideRepository504_5(
        api0: Api420_6 = Api420_6(),
        api1: Api340_6 = Api340_6(),
        api2: Api380_6 = Api380_6(),
        api3: Api408_6 = Api408_6(),
        api4: Api312_6 = Api312_6(),
        api5: Api308_6 = Api308_6(),
        api6: Api356_6 = Api356_6(),
        api7: Api436_6 = Api436_6(),
        api8: Api444_6 = Api444_6(),
        api9: Api376_6 = Api376_6()
    ): Repository504_5 {
        return Repository504_5(api0, 
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
    fun provideApi504_6(): Api504_6 {
        return Api504_6()
    }
}