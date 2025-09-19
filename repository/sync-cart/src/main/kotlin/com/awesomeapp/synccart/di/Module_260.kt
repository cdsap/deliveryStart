package com.awesomeapp.synccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccart.Viewmodel260_1
import com.awesomeapp.synccart.Activity260_2
import com.awesomeapp.synccart.Activity260_3
import com.awesomeapp.synccart.Fragment260_4
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.synccart.Service260_7
import com.awesomeapp.synccart.Worker260_8
import com.awesomeapp.synccart.Model260_10
import com.awesomeapp.synccart.Model260_11
import com.awesomeapp.synccart.Activity260_12

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api152_6 = Api152_6(),
        api1: Api144_6 = Api144_6(),
        api2: Api180_6 = Api180_6(),
        api3: Api156_6 = Api156_6(),
        api4: Api200_6 = Api200_6(),
        api5: Api164_6 = Api164_6(),
        api6: Api160_6 = Api160_6(),
        api7: Api192_6 = Api192_6(),
        api8: Api168_6 = Api168_6(),
        api9: Api188_6 = Api188_6(),
        api10: Api172_6 = Api172_6(),
        api11: Api208_6 = Api208_6(),
        api12: Api176_6 = Api176_6(),
        api13: Api196_6 = Api196_6(),
        api14: Api204_6 = Api204_6(),
        api15: Api184_6 = Api184_6(),
        api16: Api148_6 = Api148_6()
    ): Repository260_5 {
        return Repository260_5(api0, 
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
        api16)
    }

    @Provides
    @Singleton
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}