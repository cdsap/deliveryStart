package com.awesomeapp.fileprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.fileprofile.Viewmodel376_1
import com.awesomeapp.fileprofile.Activity376_2
import com.awesomeapp.fileprofile.Activity376_3
import com.awesomeapp.fileprofile.Fragment376_4
import com.awesomeapp.fileprofile.Repository376_5
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.fileprofile.Model376_8
import com.awesomeapp.fileprofile.Model376_9
import com.awesomeapp.fileprofile.Activity376_10
import com.awesomeapp.fileprofile.Model376_12
import com.awesomeapp.fileprofile.Activity376_13

@Module
@InstallIn(SingletonComponent::class)
object Module_376 {
    @Provides
    @Singleton
    fun provideRepository376_5(
        api0: Api264_6 = Api264_6(),
        api1: Api224_6 = Api224_6(),
        api2: Api184_6 = Api184_6(),
        api3: Api268_6 = Api268_6(),
        api4: Api280_6 = Api280_6(),
        api5: Api188_6 = Api188_6(),
        api6: Api284_6 = Api284_6(),
        api7: Api232_6 = Api232_6()
    ): Repository376_5 {
        return Repository376_5(api0, 
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
    fun provideApi376_6(): Api376_6 {
        return Api376_6()
    }
}