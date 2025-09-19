package com.awesomeapp.cartuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartuser.Viewmodel300_1
import com.awesomeapp.cartuser.Activity300_2
import com.awesomeapp.cartuser.Activity300_3
import com.awesomeapp.cartuser.Fragment300_4
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.cartuser.Service300_7
import com.awesomeapp.cartuser.Worker300_8
import com.awesomeapp.cartuser.Usecase300_9
import com.awesomeapp.cartuser.Model300_11
import com.awesomeapp.cartuser.Model300_12
import com.awesomeapp.cartuser.Activity300_13
import com.awesomeapp.cartuser.Model300_15
import com.awesomeapp.cartuser.Activity300_16
import com.awesomeapp.cartuser.Model300_18
import com.awesomeapp.cartuser.Activity300_19
import com.awesomeapp.cartuser.Model300_21
import com.awesomeapp.cartuser.Activity300_22
import com.awesomeapp.cartuser.Model300_24
import com.awesomeapp.cartuser.Activity300_25

@Module
@InstallIn(SingletonComponent::class)
object Module_300 {
    @Provides
    @Singleton
    fun provideRepository300_5(
        api0: Api212_6 = Api212_6(),
        api1: Api264_6 = Api264_6(),
        api2: Api268_6 = Api268_6(),
        api3: Api260_6 = Api260_6(),
        api4: Api216_6 = Api216_6(),
        api5: Api224_6 = Api224_6(),
        api6: Api272_6 = Api272_6(),
        api7: Api236_6 = Api236_6()
    ): Repository300_5 {
        return Repository300_5(api0, 
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
    fun provideApi300_6(): Api300_6 {
        return Api300_6()
    }
}