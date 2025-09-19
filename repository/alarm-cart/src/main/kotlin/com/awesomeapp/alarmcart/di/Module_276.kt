package com.awesomeapp.alarmcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcart.Viewmodel276_1
import com.awesomeapp.alarmcart.Activity276_2
import com.awesomeapp.alarmcart.Activity276_3
import com.awesomeapp.alarmcart.Fragment276_4
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.alarmcart.Usecase276_7
import com.awesomeapp.alarmcart.Model276_9
import com.awesomeapp.alarmcart.Model276_10
import com.awesomeapp.alarmcart.Activity276_11
import com.awesomeapp.alarmcart.Model276_13
import com.awesomeapp.alarmcart.Activity276_14
import com.awesomeapp.alarmcart.Model276_16
import com.awesomeapp.alarmcart.Activity276_17
import com.awesomeapp.alarmcart.Model276_19
import com.awesomeapp.alarmcart.Activity276_20
import com.awesomeapp.alarmcart.Model276_22
import com.awesomeapp.alarmcart.Activity276_23
import com.awesomeapp.alarmcart.Model276_25
import com.awesomeapp.alarmcart.Activity276_26

@Module
@InstallIn(SingletonComponent::class)
object Module_276 {
    @Provides
    @Singleton
    fun provideRepository276_5(
        api0: Api144_6 = Api144_6(),
        api1: Api152_6 = Api152_6(),
        api2: Api192_6 = Api192_6(),
        api3: Api180_6 = Api180_6(),
        api4: Api172_6 = Api172_6(),
        api5: Api148_6 = Api148_6(),
        api6: Api176_6 = Api176_6(),
        api7: Api200_6 = Api200_6(),
        api8: Api208_6 = Api208_6(),
        api9: Api164_6 = Api164_6(),
        api10: Api160_6 = Api160_6(),
        api11: Api196_6 = Api196_6(),
        api12: Api156_6 = Api156_6()
    ): Repository276_5 {
        return Repository276_5(api0, 
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
    fun provideApi276_6(): Api276_6 {
        return Api276_6()
    }
}