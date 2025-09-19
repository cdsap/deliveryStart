package com.awesomeapp.notecart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecart.Viewmodel280_1
import com.awesomeapp.notecart.Activity280_2
import com.awesomeapp.notecart.Activity280_3
import com.awesomeapp.notecart.Fragment280_4
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.notecart.Service280_7
import com.awesomeapp.notecart.Worker280_8
import com.awesomeapp.notecart.Model280_10
import com.awesomeapp.notecart.Model280_11
import com.awesomeapp.notecart.Activity280_12
import com.awesomeapp.notecart.Model280_14
import com.awesomeapp.notecart.Activity280_15
import com.awesomeapp.notecart.Model280_17
import com.awesomeapp.notecart.Activity280_18
import com.awesomeapp.notecart.Model280_20
import com.awesomeapp.notecart.Activity280_21
import com.awesomeapp.notecart.Model280_23
import com.awesomeapp.notecart.Activity280_24
import com.awesomeapp.notecart.Model280_26
import com.awesomeapp.notecart.Activity280_27
import com.awesomeapp.notecart.Model280_29
import com.awesomeapp.notecart.Activity280_30
import com.awesomeapp.notecart.Model280_32

@Module
@InstallIn(SingletonComponent::class)
object Module_280 {
    @Provides
    @Singleton
    fun provideRepository280_5(
        api0: Api148_6 = Api148_6(),
        api1: Api196_6 = Api196_6(),
        api2: Api156_6 = Api156_6(),
        api3: Api184_6 = Api184_6(),
        api4: Api180_6 = Api180_6(),
        api5: Api152_6 = Api152_6(),
        api6: Api168_6 = Api168_6(),
        api7: Api164_6 = Api164_6(),
        api8: Api188_6 = Api188_6(),
        api9: Api192_6 = Api192_6(),
        api10: Api176_6 = Api176_6(),
        api11: Api208_6 = Api208_6(),
        api12: Api200_6 = Api200_6(),
        api13: Api160_6 = Api160_6()
    ): Repository280_5 {
        return Repository280_5(api0, 
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
        api13)
    }

    @Provides
    @Singleton
    fun provideApi280_6(): Api280_6 {
        return Api280_6()
    }
}