package com.awesomeapp.calendarprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.calendarprofile.Viewmodel372_1
import com.awesomeapp.calendarprofile.Activity372_2
import com.awesomeapp.calendarprofile.Activity372_3
import com.awesomeapp.calendarprofile.Fragment372_4
import com.awesomeapp.calendarprofile.Repository372_5
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.calendarprofile.Usecase372_7
import com.awesomeapp.calendarprofile.Model372_9
import com.awesomeapp.calendarprofile.Model372_10
import com.awesomeapp.calendarprofile.Activity372_11
import com.awesomeapp.calendarprofile.Model372_13
import com.awesomeapp.calendarprofile.Activity372_14
import com.awesomeapp.calendarprofile.Model372_16
import com.awesomeapp.calendarprofile.Activity372_17
import com.awesomeapp.calendarprofile.Model372_19
import com.awesomeapp.calendarprofile.Activity372_20

@Module
@InstallIn(SingletonComponent::class)
object Module_372 {
    @Provides
    @Singleton
    fun provideRepository372_5(
        api0: Api224_6 = Api224_6(),
        api1: Api228_6 = Api228_6(),
        api2: Api292_6 = Api292_6(),
        api3: Api328_6 = Api328_6(),
        api4: Api260_6 = Api260_6(),
        api5: Api256_6 = Api256_6(),
        api6: Api280_6 = Api280_6(),
        api7: Api308_6 = Api308_6(),
        api8: Api248_6 = Api248_6(),
        api9: Api252_6 = Api252_6(),
        api10: Api304_6 = Api304_6(),
        api11: Api320_6 = Api320_6(),
        api12: Api264_6 = Api264_6(),
        api13: Api324_6 = Api324_6(),
        api14: Api288_6 = Api288_6(),
        api15: Api284_6 = Api284_6(),
        api16: Api316_6 = Api316_6(),
        api17: Api296_6 = Api296_6(),
        api18: Api312_6 = Api312_6(),
        api19: Api300_6 = Api300_6(),
        api20: Api240_6 = Api240_6(),
        api21: Api236_6 = Api236_6(),
        api22: Api232_6 = Api232_6(),
        api23: Api272_6 = Api272_6()
    ): Repository372_5 {
        return Repository372_5(api0, 
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
        api21, 
        api22, 
        api23)
    }

    @Provides
    @Singleton
    fun provideApi372_6(): Api372_6 {
        return Api372_6()
    }
}