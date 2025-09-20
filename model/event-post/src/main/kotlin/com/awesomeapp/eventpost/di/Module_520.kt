package com.awesomeapp.eventpost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventpost.Viewmodel520_1
import com.awesomeapp.eventpost.Activity520_2
import com.awesomeapp.eventpost.Activity520_3
import com.awesomeapp.eventpost.Fragment520_4
import com.awesomeapp.eventpost.Repository520_5
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.eventpost.Api520_6
import com.awesomeapp.eventpost.Service520_7
import com.awesomeapp.eventpost.Worker520_8
import com.awesomeapp.eventpost.Model520_10
import com.awesomeapp.eventpost.Model520_11
import com.awesomeapp.eventpost.Activity520_12
import com.awesomeapp.eventpost.Model520_14
import com.awesomeapp.eventpost.Activity520_15
import com.awesomeapp.eventpost.Model520_17
import com.awesomeapp.eventpost.Activity520_18
import com.awesomeapp.eventpost.Model520_20
import com.awesomeapp.eventpost.Activity520_21
import com.awesomeapp.eventpost.Model520_23
import com.awesomeapp.eventpost.Activity520_24
import com.awesomeapp.eventpost.Model520_26
import com.awesomeapp.eventpost.Activity520_27
import com.awesomeapp.eventpost.Model520_29
import com.awesomeapp.eventpost.Activity520_30
import com.awesomeapp.eventpost.Model520_32
import com.awesomeapp.eventpost.Activity520_33
import com.awesomeapp.eventpost.Model520_35
import com.awesomeapp.eventpost.Activity520_36
import com.awesomeapp.eventpost.Model520_38
import com.awesomeapp.eventpost.Activity520_39
import com.awesomeapp.eventpost.Model520_41
import com.awesomeapp.eventpost.Activity520_42
import com.awesomeapp.eventpost.Model520_44
import com.awesomeapp.eventpost.Activity520_45
import com.awesomeapp.eventpost.Model520_47
import com.awesomeapp.eventpost.Activity520_48
import com.awesomeapp.eventpost.Model520_50
import com.awesomeapp.eventpost.Activity520_51
import com.awesomeapp.eventpost.Model520_53
import com.awesomeapp.eventpost.Activity520_54
import com.awesomeapp.eventpost.Model520_56
import com.awesomeapp.eventpost.Activity520_57
import com.awesomeapp.eventpost.Model520_59
import com.awesomeapp.eventpost.Activity520_60
import com.awesomeapp.eventpost.Model520_62
import com.awesomeapp.eventpost.Activity520_63
import com.awesomeapp.eventpost.Model520_65
import com.awesomeapp.eventpost.Activity520_66
import com.awesomeapp.eventpost.Model520_68
import com.awesomeapp.eventpost.Activity520_69
import com.awesomeapp.eventpost.Model520_71
import com.awesomeapp.eventpost.Activity520_72

@Module
@InstallIn(SingletonComponent::class)
object Module_520 {
    @Provides
    @Singleton
    fun provideRepository520_5(
        api0: Api440_6 = Api440_6(),
        api1: Api364_6 = Api364_6(),
        api2: Api332_6 = Api332_6(),
        api3: Api376_6 = Api376_6(),
        api4: Api388_6 = Api388_6(),
        api5: Api392_6 = Api392_6(),
        api6: Api380_6 = Api380_6(),
        api7: Api412_6 = Api412_6()
    ): Repository520_5 {
        return Repository520_5(api0, 
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
    fun provideApi520_6(): Api520_6 {
        return Api520_6()
    }
}