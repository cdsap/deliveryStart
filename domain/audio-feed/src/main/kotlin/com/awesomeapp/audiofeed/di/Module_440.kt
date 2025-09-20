package com.awesomeapp.audiofeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audiofeed.Viewmodel440_1
import com.awesomeapp.audiofeed.Activity440_2
import com.awesomeapp.audiofeed.Activity440_3
import com.awesomeapp.audiofeed.Fragment440_4
import com.awesomeapp.audiofeed.Repository440_5
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.audiofeed.Service440_7
import com.awesomeapp.audiofeed.Worker440_8
import com.awesomeapp.audiofeed.Model440_10
import com.awesomeapp.audiofeed.Model440_11
import com.awesomeapp.audiofeed.Activity440_12
import com.awesomeapp.audiofeed.Model440_14
import com.awesomeapp.audiofeed.Activity440_15
import com.awesomeapp.audiofeed.Model440_17
import com.awesomeapp.audiofeed.Activity440_18
import com.awesomeapp.audiofeed.Model440_20
import com.awesomeapp.audiofeed.Activity440_21
import com.awesomeapp.audiofeed.Model440_23
import com.awesomeapp.audiofeed.Activity440_24
import com.awesomeapp.audiofeed.Model440_26
import com.awesomeapp.audiofeed.Activity440_27
import com.awesomeapp.audiofeed.Model440_29
import com.awesomeapp.audiofeed.Activity440_30
import com.awesomeapp.audiofeed.Model440_32
import com.awesomeapp.audiofeed.Activity440_33
import com.awesomeapp.audiofeed.Model440_35
import com.awesomeapp.audiofeed.Activity440_36
import com.awesomeapp.audiofeed.Model440_38
import com.awesomeapp.audiofeed.Activity440_39
import com.awesomeapp.audiofeed.Model440_41
import com.awesomeapp.audiofeed.Activity440_42
import com.awesomeapp.audiofeed.Model440_44
import com.awesomeapp.audiofeed.Activity440_45
import com.awesomeapp.audiofeed.Model440_47
import com.awesomeapp.audiofeed.Activity440_48
import com.awesomeapp.audiofeed.Model440_50
import com.awesomeapp.audiofeed.Activity440_51
import com.awesomeapp.audiofeed.Model440_53
import com.awesomeapp.audiofeed.Activity440_54
import com.awesomeapp.audiofeed.Model440_56
import com.awesomeapp.audiofeed.Activity440_57
import com.awesomeapp.audiofeed.Model440_59
import com.awesomeapp.audiofeed.Activity440_60
import com.awesomeapp.audiofeed.Model440_62
import com.awesomeapp.audiofeed.Activity440_63
import com.awesomeapp.audiofeed.Model440_65
import com.awesomeapp.audiofeed.Activity440_66
import com.awesomeapp.audiofeed.Model440_68
import com.awesomeapp.audiofeed.Activity440_69
import com.awesomeapp.audiofeed.Model440_71
import com.awesomeapp.audiofeed.Activity440_72
import com.awesomeapp.audiofeed.Model440_74
import com.awesomeapp.audiofeed.Activity440_75
import com.awesomeapp.audiofeed.Model440_77
import com.awesomeapp.audiofeed.Activity440_78

@Module
@InstallIn(SingletonComponent::class)
object Module_440 {
    @Provides
    @Singleton
    fun provideRepository440_5(
        api0: Api220_6 = Api220_6(),
        api1: Api244_6 = Api244_6(),
        api2: Api196_6 = Api196_6(),
        api3: Api172_6 = Api172_6(),
        api4: Api252_6 = Api252_6(),
        api5: Api276_6 = Api276_6(),
        api6: Api240_6 = Api240_6(),
        api7: Api236_6 = Api236_6(),
        api8: Api160_6 = Api160_6()
    ): Repository440_5 {
        return Repository440_5(api0, 
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
    fun provideApi440_6(): Api440_6 {
        return Api440_6()
    }
}