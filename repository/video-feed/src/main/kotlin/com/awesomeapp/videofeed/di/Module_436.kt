package com.awesomeapp.videofeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.videofeed.Viewmodel436_1
import com.awesomeapp.videofeed.Activity436_2
import com.awesomeapp.videofeed.Activity436_3
import com.awesomeapp.videofeed.Fragment436_4
import com.awesomeapp.videofeed.Repository436_5
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.videofeed.Model436_8
import com.awesomeapp.videofeed.Model436_9
import com.awesomeapp.videofeed.Activity436_10
import com.awesomeapp.videofeed.Model436_12
import com.awesomeapp.videofeed.Activity436_13
import com.awesomeapp.videofeed.Model436_15
import com.awesomeapp.videofeed.Activity436_16
import com.awesomeapp.videofeed.Model436_18
import com.awesomeapp.videofeed.Activity436_19
import com.awesomeapp.videofeed.Model436_21
import com.awesomeapp.videofeed.Activity436_22
import com.awesomeapp.videofeed.Model436_24
import com.awesomeapp.videofeed.Activity436_25
import com.awesomeapp.videofeed.Model436_27
import com.awesomeapp.videofeed.Activity436_28
import com.awesomeapp.videofeed.Model436_30
import com.awesomeapp.videofeed.Activity436_31
import com.awesomeapp.videofeed.Model436_33

@Module
@InstallIn(SingletonComponent::class)
object Module_436 {
    @Provides
    @Singleton
    fun provideRepository436_5(
        api0: Api320_6 = Api320_6(),
        api1: Api292_6 = Api292_6(),
        api2: Api260_6 = Api260_6(),
        api3: Api228_6 = Api228_6(),
        api4: Api300_6 = Api300_6(),
        api5: Api316_6 = Api316_6(),
        api6: Api296_6 = Api296_6(),
        api7: Api236_6 = Api236_6(),
        api8: Api308_6 = Api308_6(),
        api9: Api252_6 = Api252_6(),
        api10: Api248_6 = Api248_6(),
        api11: Api324_6 = Api324_6(),
        api12: Api288_6 = Api288_6(),
        api13: Api264_6 = Api264_6(),
        api14: Api244_6 = Api244_6(),
        api15: Api304_6 = Api304_6(),
        api16: Api312_6 = Api312_6(),
        api17: Api284_6 = Api284_6()
    ): Repository436_5 {
        return Repository436_5(api0, 
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
    fun provideApi436_6(): Api436_6 {
        return Api436_6()
    }
}