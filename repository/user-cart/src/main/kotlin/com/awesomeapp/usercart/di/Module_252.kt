package com.awesomeapp.usercart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.usercart.Viewmodel252_1
import com.awesomeapp.usercart.Activity252_2
import com.awesomeapp.usercart.Activity252_3
import com.awesomeapp.usercart.Fragment252_4
import com.awesomeapp.usercart.Repository252_5
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.usercart.Api252_6

@Module
@InstallIn(SingletonComponent::class)
object Module_252 {
    @Provides
    @Singleton
    fun provideRepository252_5(
        api0: Api144_6 = Api144_6(),
        api1: Api160_6 = Api160_6(),
        api2: Api152_6 = Api152_6(),
        api3: Api180_6 = Api180_6(),
        api4: Api164_6 = Api164_6(),
        api5: Api184_6 = Api184_6(),
        api6: Api148_6 = Api148_6(),
        api7: Api200_6 = Api200_6(),
        api8: Api196_6 = Api196_6(),
        api9: Api188_6 = Api188_6(),
        api10: Api172_6 = Api172_6()
    ): Repository252_5 {
        return Repository252_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi252_6(): Api252_6 {
        return Api252_6()
    }
}