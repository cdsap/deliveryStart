package com.awesomeapp.playlistprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.playlistprofile.Viewmodel392_1
import com.awesomeapp.playlistprofile.Activity392_2
import com.awesomeapp.playlistprofile.Activity392_3
import com.awesomeapp.playlistprofile.Fragment392_4
import com.awesomeapp.playlistprofile.Repository392_5
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.playlistprofile.Model392_8
import com.awesomeapp.playlistprofile.Model392_9
import com.awesomeapp.playlistprofile.Activity392_10
import com.awesomeapp.playlistprofile.Model392_12
import com.awesomeapp.playlistprofile.Activity392_13
import com.awesomeapp.playlistprofile.Model392_15
import com.awesomeapp.playlistprofile.Activity392_16
import com.awesomeapp.playlistprofile.Model392_18
import com.awesomeapp.playlistprofile.Activity392_19
import com.awesomeapp.playlistprofile.Model392_21
import com.awesomeapp.playlistprofile.Activity392_22
import com.awesomeapp.playlistprofile.Model392_24
import com.awesomeapp.playlistprofile.Activity392_25
import com.awesomeapp.playlistprofile.Model392_27
import com.awesomeapp.playlistprofile.Activity392_28
import com.awesomeapp.playlistprofile.Model392_30
import com.awesomeapp.playlistprofile.Activity392_31
import com.awesomeapp.playlistprofile.Model392_33
import com.awesomeapp.playlistprofile.Activity392_34
import com.awesomeapp.playlistprofile.Model392_36
import com.awesomeapp.playlistprofile.Activity392_37
import com.awesomeapp.playlistprofile.Model392_39
import com.awesomeapp.playlistprofile.Activity392_40
import com.awesomeapp.playlistprofile.Model392_42

@Module
@InstallIn(SingletonComponent::class)
object Module_392 {
    @Provides
    @Singleton
    fun provideRepository392_5(
        api0: Api272_6 = Api272_6(),
        api1: Api284_6 = Api284_6(),
        api2: Api232_6 = Api232_6(),
        api3: Api288_6 = Api288_6(),
        api4: Api276_6 = Api276_6(),
        api5: Api224_6 = Api224_6(),
        api6: Api252_6 = Api252_6(),
        api7: Api280_6 = Api280_6(),
        api8: Api240_6 = Api240_6(),
        api9: Api328_6 = Api328_6(),
        api10: Api300_6 = Api300_6(),
        api11: Api244_6 = Api244_6(),
        api12: Api228_6 = Api228_6(),
        api13: Api256_6 = Api256_6(),
        api14: Api260_6 = Api260_6()
    ): Repository392_5 {
        return Repository392_5(api0, 
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
        api14)
    }

    @Provides
    @Singleton
    fun provideApi392_6(): Api392_6 {
        return Api392_6()
    }
}