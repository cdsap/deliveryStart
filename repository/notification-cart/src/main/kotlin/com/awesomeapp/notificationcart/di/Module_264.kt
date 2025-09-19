package com.awesomeapp.notificationcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notificationcart.Viewmodel264_1
import com.awesomeapp.notificationcart.Activity264_2
import com.awesomeapp.notificationcart.Activity264_3
import com.awesomeapp.notificationcart.Fragment264_4
import com.awesomeapp.notificationcart.Repository264_5
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.notificationcart.Usecase264_7
import com.awesomeapp.notificationcart.Model264_9
import com.awesomeapp.notificationcart.Model264_10
import com.awesomeapp.notificationcart.Activity264_11
import com.awesomeapp.notificationcart.Model264_13
import com.awesomeapp.notificationcart.Activity264_14
import com.awesomeapp.notificationcart.Model264_16
import com.awesomeapp.notificationcart.Activity264_17
import com.awesomeapp.notificationcart.Model264_19
import com.awesomeapp.notificationcart.Activity264_20
import com.awesomeapp.notificationcart.Model264_22
import com.awesomeapp.notificationcart.Activity264_23
import com.awesomeapp.notificationcart.Model264_25

@Module
@InstallIn(SingletonComponent::class)
object Module_264 {
    @Provides
    @Singleton
    fun provideRepository264_5(
        api0: Api192_6 = Api192_6(),
        api1: Api144_6 = Api144_6(),
        api2: Api148_6 = Api148_6(),
        api3: Api156_6 = Api156_6(),
        api4: Api160_6 = Api160_6(),
        api5: Api180_6 = Api180_6(),
        api6: Api208_6 = Api208_6(),
        api7: Api184_6 = Api184_6(),
        api8: Api200_6 = Api200_6()
    ): Repository264_5 {
        return Repository264_5(api0, 
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
    fun provideApi264_6(): Api264_6 {
        return Api264_6()
    }
}