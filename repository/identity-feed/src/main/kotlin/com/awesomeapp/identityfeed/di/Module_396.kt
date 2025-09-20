package com.awesomeapp.identityfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.identityfeed.Viewmodel396_1
import com.awesomeapp.identityfeed.Activity396_2
import com.awesomeapp.identityfeed.Activity396_3
import com.awesomeapp.identityfeed.Fragment396_4
import com.awesomeapp.identityfeed.Repository396_5
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.identityfeed.Usecase396_7
import com.awesomeapp.identityfeed.Model396_9
import com.awesomeapp.identityfeed.Model396_10
import com.awesomeapp.identityfeed.Activity396_11

@Module
@InstallIn(SingletonComponent::class)
object Module_396 {
    @Provides
    @Singleton
    fun provideRepository396_5(
        api0: Api296_6 = Api296_6(),
        api1: Api300_6 = Api300_6(),
        api2: Api236_6 = Api236_6(),
        api3: Api280_6 = Api280_6(),
        api4: Api224_6 = Api224_6(),
        api5: Api240_6 = Api240_6(),
        api6: Api248_6 = Api248_6(),
        api7: Api260_6 = Api260_6(),
        api8: Api288_6 = Api288_6(),
        api9: Api256_6 = Api256_6(),
        api10: Api264_6 = Api264_6(),
        api11: Api320_6 = Api320_6(),
        api12: Api324_6 = Api324_6(),
        api13: Api284_6 = Api284_6(),
        api14: Api272_6 = Api272_6(),
        api15: Api304_6 = Api304_6(),
        api16: Api316_6 = Api316_6(),
        api17: Api308_6 = Api308_6(),
        api18: Api328_6 = Api328_6(),
        api19: Api232_6 = Api232_6(),
        api20: Api292_6 = Api292_6(),
        api21: Api268_6 = Api268_6(),
        api22: Api276_6 = Api276_6(),
        api23: Api312_6 = Api312_6(),
        api24: Api252_6 = Api252_6(),
        api25: Api228_6 = Api228_6(),
        api26: Api244_6 = Api244_6()
    ): Repository396_5 {
        return Repository396_5(api0, 
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
        api23, 
        api24, 
        api25, 
        api26)
    }

    @Provides
    @Singleton
    fun provideApi396_6(): Api396_6 {
        return Api396_6()
    }
}