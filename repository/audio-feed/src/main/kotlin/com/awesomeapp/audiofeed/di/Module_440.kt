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
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.mediacart.Api292_6
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

@Module
@InstallIn(SingletonComponent::class)
object Module_440 {
    @Provides
    @Singleton
    fun provideRepository440_5(
        api0: Api232_6 = Api232_6(),
        api1: Api324_6 = Api324_6(),
        api2: Api252_6 = Api252_6(),
        api3: Api296_6 = Api296_6(),
        api4: Api288_6 = Api288_6(),
        api5: Api304_6 = Api304_6(),
        api6: Api240_6 = Api240_6(),
        api7: Api280_6 = Api280_6(),
        api8: Api312_6 = Api312_6(),
        api9: Api236_6 = Api236_6(),
        api10: Api276_6 = Api276_6(),
        api11: Api320_6 = Api320_6(),
        api12: Api224_6 = Api224_6(),
        api13: Api228_6 = Api228_6(),
        api14: Api300_6 = Api300_6(),
        api15: Api248_6 = Api248_6(),
        api16: Api316_6 = Api316_6(),
        api17: Api292_6 = Api292_6()
    ): Repository440_5 {
        return Repository440_5(api0, 
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
    fun provideApi440_6(): Api440_6 {
        return Api440_6()
    }
}