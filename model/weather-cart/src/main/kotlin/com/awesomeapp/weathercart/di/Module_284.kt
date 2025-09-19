package com.awesomeapp.weathercart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercart.Viewmodel284_1
import com.awesomeapp.weathercart.Activity284_2
import com.awesomeapp.weathercart.Activity284_3
import com.awesomeapp.weathercart.Fragment284_4
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.weathercart.Model284_8
import com.awesomeapp.weathercart.Model284_9
import com.awesomeapp.weathercart.Activity284_10
import com.awesomeapp.weathercart.Model284_12
import com.awesomeapp.weathercart.Activity284_13
import com.awesomeapp.weathercart.Model284_15
import com.awesomeapp.weathercart.Activity284_16
import com.awesomeapp.weathercart.Model284_18
import com.awesomeapp.weathercart.Activity284_19
import com.awesomeapp.weathercart.Model284_21
import com.awesomeapp.weathercart.Activity284_22
import com.awesomeapp.weathercart.Model284_24
import com.awesomeapp.weathercart.Activity284_25
import com.awesomeapp.weathercart.Model284_27
import com.awesomeapp.weathercart.Activity284_28
import com.awesomeapp.weathercart.Model284_30
import com.awesomeapp.weathercart.Activity284_31
import com.awesomeapp.weathercart.Model284_33
import com.awesomeapp.weathercart.Activity284_34

@Module
@InstallIn(SingletonComponent::class)
object Module_284 {
    @Provides
    @Singleton
    fun provideRepository284_5(
        api0: Api264_6 = Api264_6(),
        api1: Api280_6 = Api280_6(),
        api2: Api228_6 = Api228_6(),
        api3: Api268_6 = Api268_6(),
        api4: Api248_6 = Api248_6(),
        api5: Api212_6 = Api212_6(),
        api6: Api244_6 = Api244_6(),
        api7: Api224_6 = Api224_6()
    ): Repository284_5 {
        return Repository284_5(api0, 
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
    fun provideApi284_6(): Api284_6 {
        return Api284_6()
    }
}