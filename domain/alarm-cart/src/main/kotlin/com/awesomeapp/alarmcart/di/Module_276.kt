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
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.maplogin.Api136_6
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
import com.awesomeapp.alarmcart.Model276_28
import com.awesomeapp.alarmcart.Activity276_29
import com.awesomeapp.alarmcart.Model276_31
import com.awesomeapp.alarmcart.Activity276_32

@Module
@InstallIn(SingletonComponent::class)
object Module_276 {
    @Provides
    @Singleton
    fun provideRepository276_5(
        api0: Api132_6 = Api132_6(),
        api1: Api204_6 = Api204_6(),
        api2: Api200_6 = Api200_6(),
        api3: Api148_6 = Api148_6(),
        api4: Api160_6 = Api160_6(),
        api5: Api172_6 = Api172_6(),
        api6: Api188_6 = Api188_6(),
        api7: Api208_6 = Api208_6(),
        api8: Api192_6 = Api192_6(),
        api9: Api212_6 = Api212_6(),
        api10: Api176_6 = Api176_6(),
        api11: Api180_6 = Api180_6(),
        api12: Api124_6 = Api124_6(),
        api13: Api216_6 = Api216_6(),
        api14: Api128_6 = Api128_6(),
        api15: Api220_6 = Api220_6(),
        api16: Api156_6 = Api156_6(),
        api17: Api112_6 = Api112_6(),
        api18: Api116_6 = Api116_6(),
        api19: Api152_6 = Api152_6(),
        api20: Api196_6 = Api196_6(),
        api21: Api120_6 = Api120_6(),
        api22: Api168_6 = Api168_6(),
        api23: Api164_6 = Api164_6(),
        api24: Api136_6 = Api136_6()
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
        api12, 
        api13, 
        api14, 
        api15, 
        api16, 
        api17, 
        api18, 
        api19, 
        api20, 
        api21, 
        api22, 
        api23, 
        api24)
    }

    @Provides
    @Singleton
    fun provideApi276_6(): Api276_6 {
        return Api276_6()
    }
}