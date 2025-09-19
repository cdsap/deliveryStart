package com.awesomeapp.podcastcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Viewmodel288_1
import com.awesomeapp.podcastcart.Activity288_2
import com.awesomeapp.podcastcart.Activity288_3
import com.awesomeapp.podcastcart.Fragment288_4
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.podcastcart.Usecase288_7
import com.awesomeapp.podcastcart.Model288_9
import com.awesomeapp.podcastcart.Model288_10
import com.awesomeapp.podcastcart.Activity288_11
import com.awesomeapp.podcastcart.Model288_13
import com.awesomeapp.podcastcart.Activity288_14
import com.awesomeapp.podcastcart.Model288_16
import com.awesomeapp.podcastcart.Activity288_17
import com.awesomeapp.podcastcart.Model288_19
import com.awesomeapp.podcastcart.Activity288_20
import com.awesomeapp.podcastcart.Model288_22

@Module
@InstallIn(SingletonComponent::class)
object Module_288 {
    @Provides
    @Singleton
    fun provideRepository288_5(
        api0: Api244_6 = Api244_6(),
        api1: Api248_6 = Api248_6(),
        api2: Api276_6 = Api276_6(),
        api3: Api220_6 = Api220_6(),
        api4: Api264_6 = Api264_6(),
        api5: Api212_6 = Api212_6(),
        api6: Api240_6 = Api240_6(),
        api7: Api224_6 = Api224_6(),
        api8: Api228_6 = Api228_6(),
        api9: Api236_6 = Api236_6(),
        api10: Api272_6 = Api272_6(),
        api11: Api232_6 = Api232_6(),
        api12: Api268_6 = Api268_6()
    ): Repository288_5 {
        return Repository288_5(api0, 
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
        api12)
    }

    @Provides
    @Singleton
    fun provideApi288_6(): Api288_6 {
        return Api288_6()
    }
}