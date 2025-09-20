package com.awesomeapp.feedprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.feedprofile.Viewmodel352_1
import com.awesomeapp.feedprofile.Activity352_2
import com.awesomeapp.feedprofile.Activity352_3
import com.awesomeapp.feedprofile.Fragment352_4
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.feedprofile.Model352_8
import com.awesomeapp.feedprofile.Model352_9
import com.awesomeapp.feedprofile.Activity352_10
import com.awesomeapp.feedprofile.Model352_12
import com.awesomeapp.feedprofile.Activity352_13

@Module
@InstallIn(SingletonComponent::class)
object Module_352 {
    @Provides
    @Singleton
    fun provideRepository352_5(
        api0: Api272_6 = Api272_6(),
        api1: Api292_6 = Api292_6(),
        api2: Api216_6 = Api216_6(),
        api3: Api160_6 = Api160_6(),
        api4: Api276_6 = Api276_6(),
        api5: Api196_6 = Api196_6()
    ): Repository352_5 {
        return Repository352_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi352_6(): Api352_6 {
        return Api352_6()
    }
}