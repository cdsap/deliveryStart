package com.awesomeapp.statuspost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.statuspost.Viewmodel516_1
import com.awesomeapp.statuspost.Activity516_2
import com.awesomeapp.statuspost.Activity516_3
import com.awesomeapp.statuspost.Fragment516_4
import com.awesomeapp.statuspost.Repository516_5
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.statuspost.Api516_6
import com.awesomeapp.statuspost.Usecase516_7
import com.awesomeapp.statuspost.Model516_9
import com.awesomeapp.statuspost.Model516_10
import com.awesomeapp.statuspost.Activity516_11
import com.awesomeapp.statuspost.Model516_13
import com.awesomeapp.statuspost.Activity516_14
import com.awesomeapp.statuspost.Model516_16
import com.awesomeapp.statuspost.Activity516_17
import com.awesomeapp.statuspost.Model516_19
import com.awesomeapp.statuspost.Activity516_20
import com.awesomeapp.statuspost.Model516_22
import com.awesomeapp.statuspost.Activity516_23
import com.awesomeapp.statuspost.Model516_25
import com.awesomeapp.statuspost.Activity516_26

@Module
@InstallIn(SingletonComponent::class)
object Module_516 {
    @Provides
    @Singleton
    fun provideRepository516_5(
        api0: Api400_6 = Api400_6(),
        api1: Api384_6 = Api384_6(),
        api2: Api392_6 = Api392_6(),
        api3: Api336_6 = Api336_6(),
        api4: Api432_6 = Api432_6(),
        api5: Api404_6 = Api404_6(),
        api6: Api408_6 = Api408_6(),
        api7: Api436_6 = Api436_6()
    ): Repository516_5 {
        return Repository516_5(api0, 
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
    fun provideApi516_6(): Api516_6 {
        return Api516_6()
    }
}