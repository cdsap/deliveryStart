package com.awesomeapp.postcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcart.Viewmodel256_1
import com.awesomeapp.postcart.Activity256_2
import com.awesomeapp.postcart.Activity256_3
import com.awesomeapp.postcart.Fragment256_4
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.postcart.Model256_8
import com.awesomeapp.postcart.Model256_9
import com.awesomeapp.postcart.Activity256_10
import com.awesomeapp.postcart.Model256_12
import com.awesomeapp.postcart.Activity256_13
import com.awesomeapp.postcart.Model256_15
import com.awesomeapp.postcart.Activity256_16
import com.awesomeapp.postcart.Model256_18

@Module
@InstallIn(SingletonComponent::class)
object Module_256 {
    @Provides
    @Singleton
    fun provideRepository256_5(
        api0: Api172_6 = Api172_6(),
        api1: Api196_6 = Api196_6(),
        api2: Api188_6 = Api188_6(),
        api3: Api144_6 = Api144_6(),
        api4: Api156_6 = Api156_6(),
        api5: Api180_6 = Api180_6(),
        api6: Api176_6 = Api176_6(),
        api7: Api204_6 = Api204_6(),
        api8: Api152_6 = Api152_6()
    ): Repository256_5 {
        return Repository256_5(api0, 
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
    fun provideApi256_6(): Api256_6 {
        return Api256_6()
    }
}